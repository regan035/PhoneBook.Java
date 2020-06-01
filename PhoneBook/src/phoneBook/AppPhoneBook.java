package phoneBook;

import java.util.Scanner;

public class AppPhoneBook {

	
	public static void main(String[] args) {
		Name name = new Name();
		Address address = new Address();
		Number number = new Number();
		
		
		displayMenu();
		
	}

	private static void displayMenu() {
		
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
			displayMenu();
			break;
			
		}
		
	}

	
	private static void listAll() {
		System.out.println("list all");
		displayMenu();
	}

	private static void searchByState() {
		System.out.println("search by state");
		displayMenu();
	}

	private static void searchByCity() {
		System.out.println("search by city");
		displayMenu();
	}

	private static void searchByFull() {
		System.out.println("searchByFull");
		displayMenu();
	}

	private static void searchByLast() {
		System.out.println("searchByLast");
		displayMenu();
	}

	private static void searchByFirst() {
		System.out.println("searchByFirst");
		displayMenu();
	}

	private static  void searchByNum() {
		System.out.println("searchByNum");
		displayMenu();
	}

	private static void updateRecord() {
		System.out.println("updateRecord");
		displayMenu();
	}

	private static void deleteRecord() {
		System.out.println("deleteRecord");
		displayMenu();
	}
	
	

	private static void addNew() {

		AppPhoneBook[] PhoneBook = new AppPhoneBook[9999];
		System.out.println("Please enter new record as: John Michael West Doe,574 Pole Ave, St. Petersburgh, FL,33701, 5413353131 ");
		Scanner input = new Scanner(System.in);
		//phonebook[]= {};
		
		
		
		displayMenu();
	}	
}
