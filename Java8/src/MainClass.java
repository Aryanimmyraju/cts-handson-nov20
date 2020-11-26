import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;



public class MainClass {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		ServiceClass sc=new ServiceClass();
		int choice;
		do {
			choice=scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter id,name,salary and DOB");
				Employee employee = new Employee();
				employee.setId(scanner.nextInt());
				employee.setName(scanner.next());
				employee.setSalary(scanner.nextDouble());
				employee.setDob(LocalDate.parse(scanner.next()));
				sc.add(employee);
				break;
			}
			case 2:{
				System.out.println("Enter ID to search ");
				int id=scanner.nextInt();
				Employee objEmployee=sc.findEmployee(id);
				if (objEmployee!=null)
				{
					System.out.println(objEmployee.toString());
				}
				else {
					System.out.println("No employee with that id");
				}
				break;
			}
			case 3:{
				List<Employee> employees= sc.getEmployee();
				for(Employee emp:employees)
				{
					System.out.println(emp.toString());
				}
				break;
				
			}
			case 4 :{
				List<Employee> employees= sc.getSortedEmployeesById();
				for(Employee emp:employees)
				{
					System.out.println(emp.toString());
				}
				break;
				
			}
			case 5:{
				List<Employee> employees= sc.getSortedEmployeesBySalary();
				for(Employee emp:employees)
				{
					System.out.println(emp.toString());
				}
				break;
			}
			case 6:{
				List<Employee> employees= sc.getSortedEmployeesByName();
				for(Employee emp:employees)
				{
					System.out.println(emp.toString());
				}
				break;
			}
			case 7:{
				List<Employee> employees= sc.getSortedEmployeesByDob();
				for(Employee emp:employees)
				{
					System.out.println(emp.toString());
				}
				break;
			}
			
			
			}
			
		} while (choice!=8);
	}

}
