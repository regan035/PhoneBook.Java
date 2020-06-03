package phoneBook;

public class Name {
	//data
	private String lastName;
	private String middleName;
	private String firstName;
	
	//constructor
	public Name() {
		
	}
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
	}
	
	//methods
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return firstName + " " + middleName + " " + lastName ;
	}


	
}
