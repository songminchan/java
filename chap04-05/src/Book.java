
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
		this(title, "작가미상");
		
	}
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	
	public static void main(String[] args) {
		//
		Book littleprince = new Book("어린이","유정재");
		Book loveStory = new Book("간영운전");
		Book emptybook = new Book();
		littleprince.show();
		loveStory.show();
		emptybook.show();
	}
}
