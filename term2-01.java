//Name: Khaled Kanaan Albreiki
//Emirates ID:
//School ID:302679
//Grade: 11 - CAI 1 
//Date: 23/01/2025

public class Main{

    public static void main(String[] args) {

        Book b1 = new Book("wilfred thesiger arabian sands ","John Ronald",10,6);
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getTotalCopies());
        System.out.println(b1.getAvailableCopies());

        Book myBook = new Book("Object-Oriented Programming","Jane Doe", 20,15);

 

        myBook.displayState();
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Total Copies: " + myBook.getTotalCopies());
        System.out.println("Available Copies: " + myBook.getAvailableCopies());
        

    
        myBook.setTitle("Advanced Programming concepts");
        myBook.setAuthor("John Smith");
        myBook.setTotalCopies(25);
        myBook.setAvailableCopies(10);
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Total Copies: " + myBook.getTotalCopies());
        System.out.println("Available Copies: " + myBook.getAvailableCopies());
        myBook.displayState();
        
     
     Book obj1 = new Book("Java Basics", "Alice Johnson", 10,25); 
     Book obj2 = new Book(obj1); 
     obj2.setTotalCopies(20); 
     obj1.setTotalCopies(); 
     obj2.displayState(); 
     
     
    }
}
