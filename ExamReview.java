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

6. class Book { //Class itself, contains data and methods that act upon that data.
		public Book() {} //Default Constructor
		public Book2() {} //Not a Thing. An oopsie. (Or the default constructor of a separate class that took a wrong turn at Albuquerque)
		public void Book3() {} //Void public-facing method
}

7. class Book {
		public Book() {}
		public Book(String name, String genre) { this.name = name; this.genre = genre; }
		public void Book3() {}
		public void Book3(int length, int wordCount) { System.out.println("Words per page: " + (wordCount/length)); }
}

8. class Book {
		public String name;
		public static numBooks;

		public int wppCalc(int length, int wordCount) {
			int wordsPerPage = 0;

			wordsPerPage = wordCount/length;
			return wordsPerPage;
		}
}

9. public static void main(String[] args) {
	List<Book> books = new ArrayList();
	Book b1 = new Book;
	Book b2 = new Book;

	books.add(b1);
	books.add(b2);
}
