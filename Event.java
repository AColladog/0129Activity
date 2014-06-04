public enum Event{
	ADD_FRIEND("añadir  un amigo"),
	JOIN_GROUP("unirse a un grupo"),
	UPDATE_PHOTO("actualizar foto");
	
	private String text;

	Event(String text)
	{
		this.text = text;
	}

	public String getText(){
		return text;
	}
}
