import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatController
{
    private ChatModel chatModel;
    private ChatView chatView;
    ChatController(ChatModel chatModel, ChatView chatView)
    {
        this.chatModel = chatModel;
        this.chatView = chatView;

        this.chatView.AddSendListener(new SendListener());
    }

    class SendListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            chatModel.AddMessage(chatView.GetMessageToSend());
            chatView.SetMessage(chatView.GetMessageToSend());
        }
    }
}

