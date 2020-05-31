package phoneBook;

import java.util.Scanner;

public class AppPhoneBook {

	
	public static void main(String[] args) {
		
		menu();
		
	}

	private static void menu() {
		
		System.out.println("Please Make a selecton below: ");
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
		
		Scanner input = new Scanner(System.in);//selection = Scanner.nextInt();
		int selection = input.nextInt();
		
		switch(selection) {
		
		case 1:
			addNew();
			break;
		case 2:
			deleteRecord();
			break;
		case 3:
			updateRecord();
			break;
		case 4:
			searchByNum();
			break;
		case 5:
			searchByFirst();
			break;
		case 6:
			searchByLast();
			break;
		case 7:
			searchByFull();
			break;
		case 8:
			searchByCity();
			break;
		case 9:
			searchByState();
			break;
		case 10:
			listAll();
			break;
		case 11:
			System.out.println("-----Thank you-----");
			break;
		default:
			System.out.println("Invalid Selection");
			menu();
			break;
			
		}
		
	}
	public Name[] phonebook ;
	
	private static void listAll() {
		System.out.println("list all");
		menu();
	}

	private static void searchByState() {
		System.out.println("search by state");
		menu();
	}

	private static void searchByCity() {
		System.out.println("search by city");
		menu();
	}

	private static void searchByFull() {
		System.out.println("aaaa");
		menu();
	}

	private static void searchByLast() {
		System.out.println("bbbbbbb");
		menu();
	}

	private static void searchByFirst() {
		System.out.println("ccccccc");
		menu();
	}

	private static  void searchByNum() {
		System.out.println("bddddd");
		menu();
	}

	private static void updateRecord() {
		System.out.println("eeeeeeee");
		menu();
	}

	private static void deleteRecord() {
		System.out.println("ffffff");
		menu();
	}

	private static void addNew() {
		String firstName = null;
		String lastName = null;
		String phone = null;
		Address address = new Address();
		Name name = new Name(firstName,lastName, phone, address);
		
		System.out.println("Please input new contact format as: (Last Name,First Name, Street Address, City, State, Zipcode, Phone Number)");
		Name phonebook = new Name();
		Scanner input = new Scanner(System.in);
		String newContact = input.next();
		
		
		menu();
	}	
}
