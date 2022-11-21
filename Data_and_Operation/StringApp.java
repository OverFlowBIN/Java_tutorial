
public class StringApp {

	public static void main(String[] args) {
		
		// String VS Character
		System.out.println("Hello Wolrd"); // String(문자열)
//		System.out.println('Hello World'); // Error, 문자 하나를 표현할 때 사용
		System.out.println('H'); // Character
		System.out.println("H"); // String
		
		System.out.println("Hello World"); // 띄어쓰
		System.out.println("Hello" + "World"); // 띄어쓰기 안됨
		System.out.println("Hello" + " " + "World"); // 띄어쓰기 안됨
		
		// escape
		System.out.println("Hello \nWorld"); // 줄바꿈(n : new line)
		System.out.println("Hello \"World\""); // Hello "World"
		
	}

}
