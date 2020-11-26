import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ServiceClass {
	List<Employee> employees = new ArrayList<Employee>();
	public void add(Employee employee) {
		employees.add(employee);
		
	}
	public Employee findEmployee(int id) {
		for(Employee e: employees)
		{
			if(e.getId()==id)
			{
				return e;
			}
		}
		return null;
		
	}
	public List<Employee> getEmployee() {
		return employees;
	}
	public List<Employee> getSortedEmployeesById() {
		Collections.sort(employees, (e1,e2)->e1.getId()-e2.getId());
		return employees;
	}
	public List<Employee> getSortedEmployeesBySalary() {
		Collections.sort(employees,(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())); 
		return employees;
	}
	public List<Employee> getSortedEmployeesByName() {
		Collections.sort(employees,(e1,e2)->e1.getName().compareTo(e2.getName())); 
		return employees;
	}
	public List<Employee> getSortedEmployeesByDob() {
		Collections.sort(employees,(e1,e2)->e1.getDob().compareTo(e2.getDob())); 
		return employees;
	}
	
	
	
	
	


}
