public class Chat
{
    public static void main(String[] args)
    {
        ChatModel chatModel = new ChatModel();
        ChatView chatView = new ChatView();
        ChatController chatController = new ChatController(chatModel, chatView);

        chatView.setVisible(true);
    }
}