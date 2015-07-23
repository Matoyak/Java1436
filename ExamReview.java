1. public class College {
	public static int numStudents;
	private double tuitionRate;

	public College() {
		++numStudents;
		tuitionRate = 67.50;
	}
}

2. public class Food {
	private String foodType;

	public String getType() { return foodType; }

	public void setType(String foodType) { this.foodType = foodType; }
}

3. int[] ages = new int[10];
for (int i = 1; i <= 10; ++i) {
	ages[i - 1] = i;
}

4. public int[] arrUpdate(int[] arr) {
	arr[1] = 1;
}

5. class Grade {
	public static int numGrades;
	private int score;

	public Grade() {
		++numGrades;
		score = 75;
	}
}

6. class Book {
	public Book() {}
	public Book2() {}
	public void Book3() {}
}
