package ch09.client.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import ch09.domain.userinfo.UserInfo;
import ch09.domain.userinfo.dao.UserInfoDao;
import ch09.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch09.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		System.out.println(dbType);
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("user01");
		userinfo.setPasswd("123456");
		userinfo.setUserName("LOOPY");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else if (dbType.equals("MYSQL")){ 
			userInfoDao = new UserInfoMySqlDao();
		} else {
			System.out.println("not supported");
		}
		
		if (userInfoDao != null) {
			userInfoDao.insertUserInfo(userinfo);
			userInfoDao.updateUserInfo(userinfo);
			userInfoDao.deleteUserInfo(userinfo);
		}

	}

}
