import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 */
public class NewsFeed
 {
 	private ArrayList<PostGeneral> posts;
 	


    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
    	posts = new ArrayList<>();
  
    }
    
    
    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(PostGeneral post)
    {
    	posts.add(post);
    }




 
    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()  
    {
		for(PostGeneral post: posts){
		  post.display();
		  System.out.println();
		}

		
    }
 
 }