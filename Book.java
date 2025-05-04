import ecs100.*;
/**
 * Support class for Book
 * A book contains an id, name, author, quantity, image and like count
 *
 * @author Esha Anwar
 * @version 5/5/25
 */
public class Book
{
    // fields
    private int id;
    private String title;
    private String author;
    private int quantity;
    private String image;
    static final String DEFAULT_IMAGE = "book.jpg"; // Set a default image
    private int likes = 0;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(int key, String nm, String auth, int qty, String img, int likes)
    {
        id = key;
        title = nm;
        author = auth;
        image = img;
        likes = likes;
    }
    
    public void likeBook() {
        this.likes++;
    }

    /**
     * Getter for id
     * @return integer id number of obj book
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * Getter for title
     * @return String book title
     */
    public String getTitle(){
        return this.title;
    }
    
    /**
     * Getter for author
     * @return String author's name
     */
    public String getAuthor(){
        return this.author;
    }
    
    /**
     * Getter for quantity
     * @return integer with quantity of the obj book
     */
    public int getQuantity(){
        return this.quantity;
    }
    
    /**
     * Getter for number of likes
     * @return integer with quantity of the obj likes
     */
    public int getLikes(){
        return this.likes;
    }
}
