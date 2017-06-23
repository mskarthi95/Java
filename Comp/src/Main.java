import java.util.*;

public class Main {
public static void main(String args[]){
	Book b1=new Book("kg","kgisl");
	Book b2=new Book("kgcas","kgisl");
	Book b3=new Book("kgiim","kgisl");
	
	List<Book> books= new ArrayList<Book>();

	books.add(b1);
	books.add(b2);
	books.add(b3);
	
	Library library=new Library(books);
	
	List<Book> bookss=library.get();
	
	
	for(Book bk : bookss){
        
        System.out.println("Title : " + bk.title + " and "
        +" Author : " + bk.author);
    }
}
}
