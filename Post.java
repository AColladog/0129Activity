import java.util.ArrayList;
/**
 * This class stores information about a news feed post in a 
 * social network. Posts can be stored and displayed. This class
 * serves as a superclass for more specific post types.
 */

public class Post extends PostGeneral
{

	
	private int likes;
	private ArrayList<String> comments;

 
    /**
     * Constructor for objects of class Post.
     * 
     * @param author    The username of the author of this post.
     */
	public Post(String username){
		super(username);
		likes = 0;
		comments = new ArrayList<>();
	}




    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
    	likes++;
    }	
	
    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
    	if (likes>0){
    		likes--;
    	}  	
    }	
    
    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
		comments.add(text);
    }


}
