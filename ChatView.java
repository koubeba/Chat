import javax.swing.*;
import java.awt.event.ActionListener;

public class ChatView extends JFrame
{
    private DefaultListModel<String> messagesTexts = new DefaultListModel<String>();
    private JList<String> messages = new JList<String>(messagesTexts);
    private JTextField messageToSend = new JTextField(10);
    private JButton sendButton = new JButton("Send");

    ChatView()
    {
        JPanel panel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        panel.add(messages);
        panel.add(messageToSend);
        panel.add(sendButton);

        this.add(panel);
    }
    public String GetMessageToSend()
    {
        return messageToSend.getText();
    }

    public void SetMessage(String message)
    {
        this.messagesTexts.addElement(message);
    }

    public void AddSendListener(ActionListener e)
    {
        sendButton.addActionListener(e);
    }

}