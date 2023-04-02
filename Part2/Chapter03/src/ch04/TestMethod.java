package ch04;

import javax.lang.model.element.NestingKind;

public class TestMethod {

	// 가상메서드 테이블
	// 재정의 안됐으면 타입의(변수 메서드를 호출
	// 재정의 됐다면 선언한 인스턴스의 메서드를 호출
	
	public static void main(String[] agrs) {
		
		Person p1 = new Person("이름없", "생명체");
		Person p2 = new Artist("홍대인", "아티스트");
		
		System.out.println(p1.age);
		System.out.println(p2.age);
		p2.showJobInfo();
		
	}
}
