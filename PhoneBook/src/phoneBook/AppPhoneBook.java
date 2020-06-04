package phoneBook;

import java.util.Scanner;

public class AppPhoneBook {
	//data

	Entry[] entries= new Entry[0];//entries of phone book

	public AppPhoneBook() {

		
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
		for(int i = 0;i< entries.length;i++) {
		System.out.println(entries[i].toString());

		}
//		System.out.println("New list after delete: ");
//		for(int c =0; c<entries.length;c++) {
//		System.out.println(newEntries[c].toString());
//	}
	}

	public void searchByState(Scanner input) {
		System.out.println("Please enter the state");
		String state = input.nextLine();
		for(int i = 0;i< entries.length;i++) {
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
		for(int i = 0;i< entries.length;i++) {
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
		for(int i = 0;i< entries.length;i++) {
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
		for(int i = 0;i< entries.length;i++) {
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
		boolean search = true;
		for(int i = 0;i< entries.length;i++) {
		Name searchName=entries[i].getName();
		if(searchName.getFirstName().equals(first)) {
			System.out.println(entries[i]);
			System.out.println(" ");
			search = false;
			break;
		}
	}
		if(search) {
			System.out.println("No record found");
		}
	}

	public  void searchByNum(Scanner input) {
		System.out.println("Please enter a number");
		String num = input.nextLine();
		boolean search = true;
		for(int i = 0;i< entries.length;i++) {
		Number searchNum=entries[i].getNumber();
		if(searchNum.getNumber().equals(num)) {
			System.out.println(entries[i]);	
			System.out.println(" ");
			search = false;
			break;
		}

		}
		if(search) {
		System.out.println("No record found");
		}
	}

	public void updateRecord(Scanner input) {
		System.out.println("Please enter the number you want to update. Numbers only,no '()' no '-' :");
		String num = input.nextLine();
		for(int i = 0;i< entries.length;i++) {
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
		Entry deletedEntry = new Entry();
		Entry[] tempArray = new Entry[entries.length-1];
		for(int i = 0; i < entries.length;i++) {
		Number searchNum=entries[i].getNumber();
		if(searchNum.getNumber().equals(num)) {
			deletedEntry = entries[i];
			System.out.println(entries[i]);
			break;
		}
		}
			System.out.println("Press 1 to delete record" );
			System.out.println("Press 2 to cancel");
			int choice = input.nextInt();
			int x = 0;
			if(choice == 1) {
				for(int k =0; k<entries.length;k++) {
					if(entries[k] != deletedEntry) {
						tempArray[x] = entries[k];
						x++;
					}
				//entries[i]= entries[i+1];
				}
				entries = tempArray;
				System.out.println("Record has been deleted");
					
			}

			if(choice ==2) {
				displayMenu(input);
			}
			}
		
	


	
	public void addNew(Scanner input) {
		System.out.println("Please enter new record as: John Michael West Doe,574 Pole Ave,St. Petersburgh,FL,33701,5413353131 ");
		String entry = input.nextLine();
		Entry newEntry = new Entry(entry);
		Entry tempEntry[]=new Entry[entries.length+1];
		for(int i = 0; i<entries.length;i++) {
			tempEntry[i]=entries[i];
		}
		tempEntry[tempEntry.length-1]=newEntry;
		entries = tempEntry;

		System.out.println("New Record Added");
		System.out.println(" ");



	}	
}
