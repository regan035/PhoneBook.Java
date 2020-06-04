package phoneBook;

import java.util.Scanner;

public class AppPhoneBook {
	//data
	int size;//defines max size of phone book
	int index;//index of entry array
	Entry[] entries;//entries of phone book
	Entry[] newEntries;//new list after delete
	//constructor
	public AppPhoneBook() {
		size = 9999;
		entries = new Entry[size];
		index = 0;
		newEntries = new Entry[entries.length-1];
		
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
		
		System.out.println("=====================================");
		System.out.println("||  Please make a selecton below:  ||");
		System.out.println("=====================================");
		System.out.println(" ");
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
			deleteRecord(input);
			break;
		case 3:
			updateRecord(input);
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
//		System.out.println("New list after delete: ");
//		for(int c =0; c<index;c++) {
//		System.out.println(newEntries[c].toString());
//	}
	}

	public void searchByState(Scanner input) {
		System.out.println("Please enter the state");
		String state = input.nextLine();
		for(int i = 0;i< index;i++) {
		Address searchAddress=entries[i].getAddress();
		if(searchAddress.getState().equals(state)) {
			System.out.println(entries[i].toString());
			System.out.println(" ");

	}
		else{System.out.println("No record found");
		System.out.println(" ");

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
			System.out.println(" ");

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
			System.out.println(" ");

		}
		else{System.out.println("No record found ");

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
			System.out.println(" ");

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
			System.out.println(" ");

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
			System.out.println(" ");

		}
		else{System.out.println("No record found");

		}	
		}
	}

	public void updateRecord(Scanner input) {
		System.out.println("Please enter the number you want to update. Numbers only,no '()' no '-' :");
		String num = input.nextLine();
		for(int i = 0;i< index;i++) {
		Number searchNum=entries[i].getNumber();
		if(searchNum.getNumber().equals(num)) {
			System.out.println(entries[i]);
			System.out.println("Please input the new contact as as: John Michael West Doe,574 Pole Ave, St. Petersburgh, FL,33701, 5413353131");	
			String tempInput = input.nextLine();
			Entry tempInput1 = new Entry(tempInput);
			entries[i]= tempInput1;
			
			System.out.println("New record updated :"+entries[i]);
			System.out.println(" ");
			
		}
		else{System.out.println("No record found");
		}	
		}
		//displayMenu();
	}

	public void deleteRecord(Scanner input) {
		System.out.println("Please enter the number you want to update. Numbers only,no '()','-'or space :");
		String num = input.nextLine();
		for(int i = 0;i< index;i++) {
		Number searchNum=entries[i].getNumber();
		if(searchNum.getNumber().equals(num)) {
			System.out.println(entries[i]);
			System.out.println("Press 1 to delete record" );
			System.out.println("Press 2 to cancel");
			int choice1 = input.nextInt();
			if(choice1 == 1) {
				for(int a =0, b= 0; a<entries.length;a++) {
					if(a == i) {
						continue;
					}
					newEntries[b++]=entries[i];
					
				}
				System.out.println("Record has been deleted");
					
			}

			if(choice1 ==2) {
				displayMenu(input);
			}
			}
		}
	}


	
	public void addNew(Scanner input) {
		System.out.println("Please enter new record as: John Michael West Doe,574 Pole Ave,St. Petersburgh,FL,33701,5413353131 ");
		String entry = input.nextLine();
		if(index>=size) {
			System.out.println("Error:Phonebook is full");
			return;
		}
		Entry newEntry = new Entry(entry);
		entries[index]=newEntry;
		index++;
		System.out.println("New Record Added");
		System.out.println(" ");


		//displayMenu(input);
	}	
}
