
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello 2");
		p2.close();
		System.out.println(p2.toString());  // 최상위 클래스인 Object의 메서드 toString()을 사용할 수 있다.
		

	}

}
