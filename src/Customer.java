import java.util.List;

public class Customer {

	int id;
	String name;
	List<String> phoneNumbers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Customer(int id, String name, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	
}
