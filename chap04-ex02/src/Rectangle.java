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
		System.out.print("�Է�");

		rect.widht = scan.nextInt();
		rect.height = scan.nextInt();

		System.out.print("�簢���� ���� " + rect.getArea());

		scan.close();

	}
}
