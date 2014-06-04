public class LinkPost extends MessagePost
{
	private String url;

	public LinkPost(String username, String message, String url){
		super(username, message);
		this.url = url;
	}
	
	public String getUrl(){
		return url;
	}
	
}