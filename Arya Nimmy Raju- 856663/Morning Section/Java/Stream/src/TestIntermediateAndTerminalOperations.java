import java.util.List;

public class TestIntermediateAndTerminalOperations {

	public static void main(String[] args) {
		
		List<Laptop> list = Laptop.fetchLaptops();
		list.stream().map(item -> item.getBrandName()).distinct().forEach(item -> System.out.println(item));
		long count = list.stream().filter(item -> item.getBrandName().equals("Acer")).count();
		System.out.println("Count: "+count);
	}

}
