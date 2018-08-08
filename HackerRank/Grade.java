public class Grade {

	static int[] gradeStudents(int[] rawGrades) {
		if (rawGrades.length>60 && rawGrades.length<=0)
			return rawGrades;
		for (int i = 0; i<rawGrades.length; i++) {
			if (rawGrades[i] < 0 || rawGrades[i] > 100)
				return rawGrades;
			if (rawGrades[i]>=38 && rawGrades[i]%5 >= 3) {
				rawGrades[i] = ((rawGrades[i]/5)+1)*5;
			}
		}

		return rawGrades;
	}


	public static void main(String[] args) {
		int[] rawGrades = {73, 67, 38, 110, 84};
		
		rawGrades = gradeStudents(rawGrades);	
		for (int i = 0; i < rawGrades.length; i++) 
			System.out.println(" : "+rawGrades[i]);
	}

}
