
public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
			
}
	
	public Book() {
		this(" "," ");
		
	}
	
	public Book(String title) {
		this(title, "�۰��̻�");
		
	}
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	
	public static void main(String[] args) {
		//
		Book littleprince = new Book("���","������");
		Book loveStory = new Book("��������");
		Book emptybook = new Book();
		littleprince.show();
		loveStory.show();
		emptybook.show();
	}
}
