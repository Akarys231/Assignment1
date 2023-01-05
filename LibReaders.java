import java.util.ArrayList;
public class LibReaders {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;
    private ArrayList<String> books = new ArrayList<String>();
    public LibReaders(String fullName, int cardNumber, String faculty, String dateOfBirth, String phone){
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }
    public LibReaders(){
        this.fullName = "?";
        this.cardNumber = 0;
        this.faculty = "?";
        this.dateOfBirth = "?";
        this.phone = "?";
    }
    public void takeBook(String author, String bookName){
        Book book = new Book(author,bookName);
        books.add(bookName);
        System.out.print(this.fullName + " took " + books.size() + " books: ");
        for(int i = 0; i < books.size();i++){
            System.out.print(books.get(i) + ", ");
        }
    }
    int sum = 0;
    ArrayList<String> returnedBooks = new ArrayList<String>();
    public void returnBook(String author, String bookName){
        for(int i = 0; i< Book.author.size(); i++){
            if(author == Book.author.get(i) && bookName == Book.bookName.get(i)){
                Book.bookName.remove(i);
                Book.author.remove(i);
            }
        }
        for(int i = 0; i< books.size(); i++){
            if(bookName == books.get(i)){
                returnedBooks.add(books.get(i));
                books.remove(i);
                sum++;
                break;
            }
        }

        System.out.print(this.fullName + " returned " + sum + " books: ");
        for(int i = 0; i < returnedBooks.size();i++){
            if(i == returnedBooks.size() - 2) {
                System.out.print(returnedBooks.get(i) + ", ");
            }
            else{
                System.out.println(returnedBooks.get(i));
            }
        }
    }

}
