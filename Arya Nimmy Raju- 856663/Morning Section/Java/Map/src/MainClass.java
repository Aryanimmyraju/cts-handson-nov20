import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		Map<String, ArrayList<String> > map = new HashMap<>();
		map.put("CS",new ArrayList<String>());
		map.put("EC", new ArrayList<String>());
		map.get("CS").add("Arya");
		map.get("CS").add("Nimmy");
		map.get("EC").add("Kerthu");
		map.get("EC").add("Lakshmi");
		System.out.println("CS ->"+map.get("CS"));
		System.out.println("EC ->"+map.get("EC"));
	}

}
