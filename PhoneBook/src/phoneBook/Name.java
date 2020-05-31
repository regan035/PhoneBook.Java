package phoneBook;

public class Name {
	
	private String lastName;
	//private String middleName;
	private String firstName;
	private String phone;
	private Address address;
	public Name() {
		super();
	}
	public Name(String lastName,  String firstName, String phone, Address address) {
		super();
		this.lastName = lastName;
		//this.middleName = middleName;
		this.firstName = firstName;
		this.phone = phone;
		this.address = address;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	public String getMiddleName() {
//		return middleName;
//	}
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
	public String getFistName() {
		return firstName;
	}
	public void setFistName(String fistName) {
		this.firstName = fistName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	
}
