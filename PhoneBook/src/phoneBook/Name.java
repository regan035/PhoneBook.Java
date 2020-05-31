package phoneBook;

public class Name {
	
	private String lastName;
	private String middleName;
	private String firstName;
	public Name() {
		super();
	}
	public Name(String lastName, String middleName, String firstName) {
		super();
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
	}
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
		return "Name [lastName=" + lastName + ", middleName=" + middleName + ", firstName=" + firstName + "]";
	}


	
}
