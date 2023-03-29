package ch10;

public class Birthday {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public Birthday() {
		isValid = true;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if (month == 2 && (day < 1 || day > 28)) {
			isValid = false;
			return;
		}
		else if (day < 1 || day > 31) {
			isValid = false;
			return;
		}
		else {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if ( month < 1 || month > 12) {
			isValid = false;
			return;
		}
		else {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if (year < 0) {
			isValid = false;
			return;
		}
		else {
			this.year = year;
		}
	}
	
	public boolean isValid() {
		return isValid;
	}
	
	public void printThis() {
		System.out.println(this);
	}

}
