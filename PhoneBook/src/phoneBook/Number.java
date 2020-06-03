package phoneBook;

public class Number {

		//data
		String number;
		
		//constructor
		public Number() {
			
		}

		public Number(String number) {
			
			number = number.trim();
			this.number = number;
		}
		
		//methods
		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		@Override
		public String toString() {
			String areaCode = number.substring(0,3);
			String preFix = number.substring(3,6);
			String num = number.substring(6);
			return " ("+areaCode + ")"+preFix+"-"+num;
		}
		
	

	
}
