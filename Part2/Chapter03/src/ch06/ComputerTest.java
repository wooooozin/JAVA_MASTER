package ch06;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer computer = new Computer();	- 추상 클래스는 인스턴스화 할 수 없다
		
		
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.typing();
		myNote.display();
	}

}
