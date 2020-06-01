package phoneBook;

public class Number {

	
		String number;

		public Number() {
			super();
		}

		public Number(String number) {
			super();
			number = number.trim();
			this.number = number;
		}

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
			return "("+areaCode + ")"+preFix+"-"+num;
		}
		
	

	
}
