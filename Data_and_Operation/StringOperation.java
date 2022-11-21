
public class StringOperation {

	public static void main(String[] args) {
		System.out.println("Hello World".length()); // 11
		System.out.println("Hello World".replace("Hello", "Hello OverFlowBIN")); // Hello OverFlowBIN World
		System.out.println("Hello World".replace(" ", "")); // HelloWolrd
		System.out.println("Hello World".replace("H", "T")); // Tello World
		System.out.println("Hello World".replace('H', 'T')); // Tello World
	}

}
