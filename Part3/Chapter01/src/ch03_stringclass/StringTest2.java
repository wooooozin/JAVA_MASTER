package ch03_stringclass;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 2.StringBuilder, StringBuffer 활용하기
		// 내부적으로 가변적인 char[]를 멤버 변수로 가짐
		// 문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
		// 새로운 인스턴스를 생성하지 않고 char[] 를 변경함
		// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
		// 단인 쓰레드 프로그램에서는 StringBuilder 사용을 권장
		// toString() 메서드로 String반환
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); // 498931366
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder)); // 2060468723
		
		builder.append(android);
		System.out.println(builder.toString()); // javaandroid
		System.out.println(System.identityHashCode(builder)); // 2060468723
		
		
		// 3.text block
		// 문자열을 """ """ 사이에 이어서 만들 수 있음
		// html, json 문자열을 만드는데 유용하게 사용할 수 있음
		
		String strBlock = """
						이것은
						새로 생성된
						텍스트 블럭 입니다.
						""";
		System.out.println(strBlock);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span> example text </span>
					</body>
				</html>		
				""";
	}

}
