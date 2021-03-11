import java.util.ArrayList;


public class Library {
    
    public static void main(String[] args) {
        
    
    ArrayList<Book> myLibrary = new ArrayList<Book>();
    
    

    
    }
    
    public static void addBook(ArrayList<Book> b,Book element,int x){
        
        b.add(x, element);
    }

    public static void searchBook(ArrayList<Book> b,String bookName){
        
        String nameSearch = "\n";
        for(int i = 0; i<b.size();i++){
        if(bookName.equals(b.get(i).getTitle())){
            System.out.println(bookName + " is in the library!");
            System.out.println("Book's informations are here : " + b.get(i).toString());
        }
        else{
            continue; //There will not be a message if the book we are looking for is not in the library.
        }
        
            
    }
    
    }

}