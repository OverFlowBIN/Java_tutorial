
public class Casting {

	public static void main(String[] args) {
		// Casting : convert data type
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1; // 위와 동일한 방법이다 (위의 코드는 자동으로 된것)
		System.out.println(b); // 1.0 : 1이라는 실수를 저장하면 1.0으로 결과값이 나온다.
		System.out.println(b2);
		
//		int c = 1.1;
		int d = (int) 1.1; // double => int로 바꾸면 손실이 일어
		double e = 1.1;
		System.out.println(d); // 1
		System.out.println(e); // 1.1
		
		// int to String
		String f = Integer.toString(1);
		System.out.println(f); // "1"
		System.out.println(f.getClass()); // class java.lang.String
		

	}

}
