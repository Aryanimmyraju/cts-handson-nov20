import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<User> list =new ArrayList<>();
		User a = new User("1","Arya","blah1");
		User b = new User("2","Athul","blah2");
		User c = new User("3","Ritika","blah3");
		User d = new User("4","Apoorva","blah4");
		User e = new User("5","Amruda","blah5s");
		list.add(c);
		list.add(b);
		list.add(a);
		list.add(d);
		list.add(e);
		for(int i =0;i<list.size();i++)
		{
			if(list.get(i).getName().length()>5)
			{
				System.out.println(list.get(i).getName());
			}
		}
		
	}

}
