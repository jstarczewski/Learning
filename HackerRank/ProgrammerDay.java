public class ProgrammerDay {

	static String dayOfProgrammer(int year) {
	
		if (year < 1700 || year > 2700)
			return null;
		if (year < 1918) {
			if (year % 4==0) {
				return "12.09."+year;
			}
			else {
				return "13.09."+year;
			}
		}
		if (year == 1918) {
			return "30.07."+year;
		}	
		if (year > 1918) {
			if (year % 400 == 0 || (year % 4 ==0 & year % 100 != 0)) {
				return "12.09."+year;
			}
			else {
				return "13.09."+year;
			}
		}
		return null;	
	}
	/*		int days = 256;
			days-=31; 
			if (year % 4 == 0) {
				days-=28;
			}
			else {
				days-=29;
			}
			days -= (31 + 30 + 31 + 30 + 31 + 31);
			if (days > 0 ) {
				days += 31;
				return days+".08."+year;
			}
			if (days < 30) {
				return days+".09."+year;
			}
		}
		if (year == 1918) {
			
		}
*/	
	

	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(2016));
	}

}
