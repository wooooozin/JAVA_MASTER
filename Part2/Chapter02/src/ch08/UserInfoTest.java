package ch08;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo user1 = new UserInfo("남성", 180, 90, "Tomas", 37);
		String user1Info = user1.getUserInfo();
		System.out.println(user1Info);
		
	}

}
