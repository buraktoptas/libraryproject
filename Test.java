import java.util.ArrayList;


public class Test {

    public static void main(String[] args) {
        
     ArrayList<Book> myLibrary = new ArrayList<Book>();
     
     Book bb = new Book("Apple", 10, "2010","Germany");
     Book cc = new Book("Banana",25, "2013","France");
     Book dd = new Book("Strawberry", 5, "2005","Austria");
     Book ee = new Book("Avocado", 10, "2016","Brazil");
     Book ff = new Book("Watermelon", 30, "2020","Turkey");
     
     
     Library.addBook(myLibrary,bb, 0);
     Library.addBook(myLibrary,cc, 1);
     Library.addBook(myLibrary,dd, 2);
     Library.addBook(myLibrary,ee, 3);
     Library.addBook(myLibrary,ff, 4);
     
     Library.searchBook(myLibrary,"Apple");
     Library.searchBook(myLibrary,"Watermelon");
     Library.searchBook(myLibrary,"Les Miserables");
     
     
     
     
    }
    
}