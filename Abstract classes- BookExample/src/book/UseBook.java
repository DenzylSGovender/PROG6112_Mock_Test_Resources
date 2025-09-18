
package book;


public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("The Great Gatsby");
        
        System.out.println("Fiction Book:");
        System.out.println("Title: " + fictionBook.getTitle());
        System.out.println("Price: R" + fictionBook.getPrice());
        
        
        NonFiction nonFictionBook = new NonFiction("The right stuff");
 
        System.out.println("\nNonFiction Book:");
        System.out.println("Title: " + nonFictionBook.getTitle());
        System.out.println("Price: R" + nonFictionBook.getPrice());
    }
}

