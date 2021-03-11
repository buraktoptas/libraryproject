public class Book {
   private String title;
   private double price;
   private String year;
   private String publishedBy;


    public Book(String title, double price, String year, String publishedBy) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.publishedBy = publishedBy;
    }

   
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

   
    public String getYear() {
        return year;
    }

    
    public void setYear(String year) {
        this.year = year;
    }

   
    public String getPublishedBy() {
        return publishedBy;
    }

    
    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    
    public String toString() {
        return "Book{" + "title=" + title + ", price=" + price + ", year=" + year + ", publishedBy=" + publishedBy + '}';
    }


}
