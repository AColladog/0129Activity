public class PostGeneral
{
	private String username;
	private long timestamp;/**
     * Constructor for objects of class Post.
     * 
     * @param author    The username of the author of this post.
     */
	public PostGeneral(String username){
		this.username = username;
		timestamp = System.currentTimeMillis();
	}
	    public long getTimeStamp()
    {	
    	return timestamp;
    }
     
    private String timeString(long time)
    {	
    	String mensaje= "";
    	long timeNow = System.currentTimeMillis();
    	long diferencia=timeNow-time; 
    	long minutos = diferencia / 60000;   	
    	if(minutos == 0){
			mensaje = "Hace " + (diferencia/1000) + " segundos";
    	}
    	else {
    		mensaje = "Hace " + minutos + " minutos";
    	} 	  
    	return mensaje;
    }

    public void display()
    {	
		System.out.println("Usuario: "+ username);
		System.out.println(timeString(timestamp));
		
		/*System.out.println(likes + " me gusta");
		
		if(comments.isEmpty()) {
			System.out.println("No hay comentarios");		
		}
		else {
			System.out.println("Hay " + comments.size() + " comentario(s)");
			for (String comment : comments) {
				System.out.println(comment);
			}
		}*/
		

	}
}