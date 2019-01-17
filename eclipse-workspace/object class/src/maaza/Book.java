package maaza;

public class Book {
	String bName;
	String bAuthor;
	int bpage;
	public Book(String bName,String bAuthor,int bpage)
	{
		this.bName=bName;
		this.bAuthor=bAuthor;
		this.bpage=bpage;
	}
public boolean equals(Object o1)
{
	Book b2=(Book)o1;
	return this.bName==b2.bName;
}
	public static void main(String[] args) {
		Book b1=new Book("java","priti",2000);
		Book b2=new Book("java","priti",2000);
		System.out.println(b1.equals(b2));

	}

}
