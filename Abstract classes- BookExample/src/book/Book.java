
package book;


public abstract class Book {//Here is my abstract class
    private String title;
    
    public double price;//Experiment with the access modifiers

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}

