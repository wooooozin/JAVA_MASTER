package ch12;

public class TakePassengerTest {

	public static void main(String[] args) {
		
		Student st1 = new Student("loopy", 5000);
		Student st2 = new Student("zanmang", 10000);

		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		
		st1.takeBus(bus100);
		st2.takeSubway(subwayGreen);
	
		st1.showInfo();
		st2.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();

	}

}
