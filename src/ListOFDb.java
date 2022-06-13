import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOFDb {

	public static List<Customer> getAll(){
		return Stream.of(new Customer(1,"AA",Arrays.asList("12344","2324343")),
				new Customer(1,"AA",Arrays.asList("12344","2324343")),
				new Customer(1,"AA",Arrays.asList("12344","2324343")),
				new Customer(1,"AA",Arrays.asList("12344","2324343"))
				).collect(Collectors.toList());
		}
	
	}
