import java.util.ArrayList;

public class Book {
    public static ArrayList<String> author = new ArrayList<String>();
    public static ArrayList<String> bookName = new ArrayList<String>();
    public Book(String author, String bookName){
        this.author.add(author);
        this.bookName.add(bookName);
    }
    public Book(){

    }
}
