package ch16;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];

		for (Book book : library) {
			System.out.println(book); // null
		}
	
	
		library[0] = new Book("1", "루피1");
		library[1] = new Book("1", "루피2");
		library[2] = new Book("1", "루피3");
		library[3] = new Book("1", "루피4");
		library[4] = new Book("1", "루피5");
		
		for (Book book : library) {
			System.out.println(book); // 주소 출력;
		}
		
	}

}
