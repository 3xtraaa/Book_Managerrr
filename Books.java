import java.util.HashMap;
import java.util.Scanner;
import ecs100.*;
/**
 * Holds a collection of collection of books in a hashmap
 * Allows a user to add, find, print all, edit, and delete
 * Prevents a user from adding a duplicate
 *
 * @author Esha Anwar
 * @version 5/5/25
 */
public class Books
{
    // instance variables/fields
    private HashMap<Integer, Book> library; // declaring the hashmap
    private int currBookId; // store the current id of book being added
    private Book currBook; // store the instance of the current book
    private Scanner scanner;

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        library = new HashMap<Integer, Book>(); //initialise hashmap
        
        // Creating books
        // Book(int key, String nm, String auth, int qty, String img, int likes)
        Book b1 = new Book(1, "The Rose Bargain", "Sasha Peyton Smith", 2, "", 0);
        Book b2 = new Book(2, "Unfamiliar Magic", "Alexander R.C.", 1, "", 3);
        Book b3 = new Book(3, "Poukahangatus", "Tayi Tibble", 5, "", 10);
        
        //add books to collection
        this.library.put(1, b1);
        this.library.put(2, b2);
        this.library.put(3, b3);
        
        // Store the current book id
        this.currBookId = 3;
    }
    
    /**
     * Menu to print and call appropriate methods
     * console-based menu
     */
    public void menu(){
        //Print menu and force choice
        String choice;
        do{
            System.out.println("(A)dd a book");
            System.out.println("(F)ind a book");
            System.out.println("(P)rint all");
            System.out.println("(Q)uit");
            
            System.out.println("Enter a choice: ");
            choice = scanner.nextLine().trim().toUpperCase(); // avoid case-senstivity and 
                                                              // whitespace before or after
            
            switch(choice){
                case "A": // if the choice is exactly A
                    System.out.print("\nEnter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextLine();
            }
            
        }while (!choice.equals("Q"));   //loop until choice is 'Q'
    }
}
