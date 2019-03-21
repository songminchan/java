import java.util.Scanner;

public class Rectangle {

	int widht;
	int height;

	public Rectangle() {

	}

	public int getArea() {
		return widht * height;

	}

	public static void main(String[] args) {
		//
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.print("입력");

		rect.widht = scan.nextInt();
		rect.height = scan.nextInt();

		System.out.print("사각형의 면적 " + rect.getArea());

		scan.close();

	}
}
