package ch10;

public class BirthdayTest {

	public static void main(String[] args) {

		Birthday myBirthday = new Birthday();
		myBirthday.setMonth(2);
		myBirthday.setDay(28);
		myBirthday.setYear(2002);
		
		System.out.println(myBirthday.isValid());
		System.out.println(myBirthday);
		myBirthday.printThis();
	}

}
