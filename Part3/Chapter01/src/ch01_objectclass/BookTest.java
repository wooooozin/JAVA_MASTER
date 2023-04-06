package ch01_objectclass;

class Book {
	// 모든 클래스는 Object 클래스를 상속 받는다.
	// java.lang.Object 클래스
	// 컴파일러가 extends Object를 추가함
	// class Book extends Object { }
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 기존의 toString() 메서드 재정의해서 사용
	@Override
	public String toString() {
		return title + "," + author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		
		// toString() 메서드
		// 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
		Book book1 = new Book("잔망루피", "루피");
		System.out.println(book1.toString()); // ch01_objectclass.Book@7ad041f3
		System.out.println(book1); // ch01_objectclass.Book@7ad041f3
		
		// String이나 Integer 클래스는 이미 재정의 되어 있음		
		String str = new String("str test");
		System.out.println(str.toString()); // str test
		
		Integer integer = new Integer(100);
		System.out.println(integer.toString()); // 100
		
		// 기존의 toString() 메서드 재정의해서 사용
		System.out.println(book1.toString()); // 잔망루피,루피
	}

}
