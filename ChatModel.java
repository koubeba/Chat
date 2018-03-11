import java.util.ArrayList;
public class ChatModel
{
	protected static int maxId = 0;
    private class Message
    {
        private String text;
        private int senderId;
        Message(String text, int id)
        {
            this.text = text;
            this.senderId = id;
        }
        public String GetText()
        {
            return this.text;
        }
    }
	
	private class User
	{
		private int id;
		private String username;
		public User(String username)
		{
			this.username = username;
			maxId++;
		}
		public void SendMessage()
		{
		}
	}
	
	private class Host extends User
	{
		public Host(String username)
		{
			super(username);
		}
	}
	
	private class Client extends User
	{
		public Client(String username)
		{
			super(username);
		}
	}
	
	private ArrayList<Message> messages;
    
    ChatModel()
    {
        messages = new ArrayList<Message>();
    }

    public void AddMessage(String text)
    {
        messages.add(new Message(text, 0));
    }
}