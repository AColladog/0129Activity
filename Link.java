
/**
 * Write a description of class Link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Link extends Post
{
    private String message;
    private String url;

    /**
     * Constructor for objects of class Link
     * @param message Es el mensaje que se ve
     * @param url Es la dirección donde te lleva ese mensaje 
     */
    public Link(String username, String message, String url)
    {
        super(username);
        this.message = message;
        this.url = url;
    }

    /**
     * return el mensaje introducido
     */
    public String getMessage(){
        return message;
    }
    
    /**
     * return la url donde esta ese mensaje
     */
    public String getUrl(){
        return url;
    }
}
