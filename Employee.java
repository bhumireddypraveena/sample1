package task1;

public class Employee {
	private int id;
	private String Name;
	private int sal;
	private Address address;
	
	public Employee(int id, String name, int sal, Address address) {
		super();
		this.id = id;
		Name = name;
		this.sal = sal;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printDetails() {
		System.out.println("Employee ID:"+id);
		System.out.println("Employee name:"+Name);
		System.out.println("Employee salary:"+sal);
		System.out.println("Employee Address:"+ address.getFloornumber()+","+address.getStreetname()+","+address.getCityname()+","+address.getState()+","+address.getCountry());

	}
	

}
