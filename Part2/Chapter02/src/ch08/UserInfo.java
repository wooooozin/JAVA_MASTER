package ch08;

public class UserInfo {
	
	public String gender;
	public double height;
	public double weight;
	public String userName;
	public int userAge;
	
	public UserInfo(String gender, double height, double weight, String userName, int userAge) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	public String getUserInfo() {
		return gender + "인 유저의 이름은 " + userName + " 이고, 나이는 " + userAge + " 입니다.\n"
				+ "키와 몸무게는 " + height + ", " + weight + " 입니다.";
	}

}
