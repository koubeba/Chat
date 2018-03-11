import java.util.ArrayList;
public class ChatModel
{
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