package phoneBook;

import java.util.Scanner;

public class AppPhoneBook {
	//data
	int size;//defines max size of phone book
	int index;//index of entry array
	Entry[] entries;//entries of phone book
	
	//constructor
	public AppPhoneBook() {
		size = 9999;
		entries = new Entry[size];
		index = 0;
		
	}
	//methods
	public static void main(String[] args) {

		AppPhoneBook phoneBook = new AppPhoneBook();
		Scanner input = new Scanner(System.in);
		
		int menuSelection = 0;
		while (menuSelection !=11) {
		menuSelection = phoneBook.displayMenu(input);
		}
	}

	public int displayMenu(Scanner input) {
		
		System.out.println("Please make a selecton below: ");
		System.out.println("1. Add New Record");
		System.out.println("2. Delete a Record");
		System.out.println("3. Update a Record");
		System.out.println("4. Search by Telephone Number");
		System.out.println("5. Search by First Name");
		System.out.println("6. Search by Last Name");
		System.out.println("7. Search by Full Name");
		System.out.println("8. Search by City");
		System.out.println("9. Search by State");
		System.out.println("10. List All Record");
		System.out.println("11. Exit");
		
		
		int selection = input.nextInt();
		input.nextLine();
		
		switch(selection) {
		
		case 1:
			
			addNew(input);
			break;
		case 2:
			deleteRecord();
			break;
		case 3:
			updateRecord();
			break;
		case 4:
			searchByNum(input);
			break;
		case 5:
			searchByFirst(input);
			break;
		case 6:
			searchByLast(input);
			break;
		case 7:
			searchByFull(input);
			break;
		case 8:
			searchByCity(input);
			break;
		case 9:
			searchByState(input);
			break;
		case 10:
			listAll();
			break;
		case 11:
			System.out.println("-----Thank you-----");
			break;
		default:
			System.out.println("Invalid Selection");
			displayMenu(input);
			break;
			
		}
		return selection;
		
	}

	
	public void listAll() {
		System.out.println("List All Records ");
		for(int i = 0;i< index;i++) {
			System.out.println(entries[i].toString());
		}
		//displayMenu(null);
	}

	public void searchByState(Scanner input) {
		System.out.println("Please enter the state");
		String state = input.nextLine();
		for(int i = 0;i< index;i++) {
		Address searchAddress=entries[i].getAddress();
		if(searchAddress.getState().equals(state)) {
			System.out.println(entries[i].toString());
	}
		else{System.out.println("No record found");
		}	
	}	
	}

	public void searchByCity(Scanner input) {
		System.out.println("Please enter the city");
		String city = input.nextLine();
		for(int i = 0;i< index;i++) {
		Address searchAddress=entries[i].getAddress();
		if(searchAddress.getCity().equals(city)) {
			System.out.println(entries[i].toString());
	}
		else{System.out.println("No record found");
		}	
	}	
	}
	
	public void searchByFull(Scanner input) {
		System.out.println("Please enter the full name");
		System.out.println("Please enter the first name");
		String first = input.nextLine();
		System.out.println("Please enter the middle name");
		String middle= input.nextLine();
		System.out.println("Please enter the last name");
		String last = input.nextLine();
		for(int i = 0;i< index;i++) {
		Name searchName=entries[i].getName();
		if(searchName.getFirstName().equals(first) && searchName.getMiddleName().equals(middle) && searchName.getLastName().equals(last)) {
			System.out.println(entries[i].toString());
		}
		else{System.out.println("No record ");
		}	
		}
	}

	public void searchByLast(Scanner input) {
		System.out.println("Please enter a last name");
		String last = input.nextLine();
		for(int i = 0;i< index;i++) {
		Name searchName=entries[i].getName();
		if(searchName.getLastName().equals(last)) {
			System.out.println(entries[i]);
		}
		else{System.out.println("No record found");
		}	
		}
	}

	public void searchByFirst(Scanner input) {
		System.out.println("Please enter a first name");
		String first = input.nextLine();
		for(int i = 0;i< index;i++) {
		Name searchName=entries[i].getName();
		if(searchName.getFirstName().equals(first)) {
			System.out.println(entries[i]);
		}
		else{System.out.println("No record found");
		}	
		}
	}

	public  void searchByNum(Scanner input) {
		System.out.println("Please enter a number");
		String num = input.nextLine();
		for(int i = 0;i< index;i++) {
		Number searchNum=entries[i].getNumber();
		if(searchNum.getNumber().equals(num)) {
			System.out.println(entries[i]);
		}
		else{System.out.println("No record found");
		}	
		}
	}

	public void updateRecord() {
		System.out.println("updateRecord");
		//displayMenu();
	}

	public void deleteRecord() {
		System.out.println("deleteRecord");
		//displayMenu(null);
	}

	public void addNew(Scanner input) {
		System.out.println("Please enter new record as: John Michael West Doe,574 Pole Ave, St. Petersburgh, FL,33701, 5413353131 ");
		String entry = input.nextLine();
		if(index>=size) {
			System.out.println("Error:Phonebook is full");
			return;
		}
		Entry newEntry = new Entry(entry);
		entries[index]=newEntry;
		index++;
		System.out.println("New Record Added");

		
		//displayMenu(input);
	}	
}
