package phoneBook;

public class Entry {
	
	private Name name;
	private Address address;
	private Number number;
	public Entry() {
		super();
	}
	public Entry(Name name, Address address, Number number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public Entry(String input) {
		String[] inputArray = input.split(",");
		
		handleName(inputArray[0]);
		
		address = new Address(inputArray[1],inputArray[2],inputArray[3],inputArray[4]);
		
		number = new Number(inputArray[5]);
		
	}
	private void handleName(String str) {
		String[] nameArray = str.split(" ");
		if (nameArray.length==2) {
			name = new Name(nameArray[0]," ",nameArray[1]);
		}
		else if (nameArray.length ==3) {
			name = new Name(nameArray[0],nameArray[1],nameArray[2]);
		}
		else {
			String middle = " ";
			for(int i =1;i<nameArray.length-1;i++) {
				middle =middle+nameArray[i]+" ";
			}
			name = new Name(nameArray[0],middle,nameArray[nameArray.length-1]);
		}
	}
	@Override
	public String toString() {
		return "Entry [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	public Name getName() {
		return name;
		
	}
	
	public Address getAddress() {
		return address;
		
		
	}
	public Number getNumber() {
		return number;
	}
}

