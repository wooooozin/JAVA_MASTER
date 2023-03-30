package ch16;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		Book[] newCopyLibrary = new Book[5];
	
		library[0] = new Book("1", "루피1");
		library[1] = new Book("1", "루피2");
		library[2] = new Book("1", "루피3");
		library[3] = new Book("1", "루피4");
		library[4] = new Book("1", "루피5");
		
		// 얕은 복사 - System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드
		// 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨 즉, 두 배열이 같은 객체를 가리킴
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		library[0].setTitle("newBook");
		library[0].setAuthor("저자");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("COPY_________");
		
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		// 깊은 복사 - 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
		
		for (int i = 0; i < library.length; i++) {
			newCopyLibrary[i] = new Book();
			newCopyLibrary[i].setTitle(library[i].getTitle());
			newCopyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("---book");
		library[0].setAuthor("---athor");
		
		for (Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("Deep COPY_________");
		
		for (Book book : newCopyLibrary) {
			book.showBookInfo();
		}
		
	}

}
