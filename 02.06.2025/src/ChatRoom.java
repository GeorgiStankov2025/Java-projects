import java.util.*;

public class ChatRoom
{

    private String chatName;

    List<User>usersInChat=new LinkedList<>();

    List<Message>messagesInChat=new LinkedList<>();

    public ChatRoom(String name)
    {

        this.chatName=name;

    }

    public void AddUser(User user)
    {

        usersInChat.add(user);

    }

    public void RemoveUser(User user)
    {

        usersInChat.remove(user);

    }

    public void AddMessage(Message message)
    {

        for(int i=0; i<usersInChat.size();i++)
        {

            if(message.messageAuthor==usersInChat.get(i))
            {

                messagesInChat.add(message);

            }

        }

    }

    public void RemoveMessage(Message message)
    {

        messagesInChat.remove(message);

    }

    public void ChatHistory()
    {

        for(int i=0; i< messagesInChat.size();i++)
        {

            System.out.println(messagesInChat.get(i).messageAuthor.userName+": "+messagesInChat.get(i).messageContent);

        }

    }

}
