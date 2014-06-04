public class EventPost extends PostGeneral
{
	private Event tipoEvento;

	public EventPost(String username, Event tipoEvento)
	{
		super(username);
		this.tipoEvento = tipoEvento;
	}
	
	public String getEvento()
	{
		return tipoEvento.getText();
	}	

}

