
public class ChatSystemMain
{
    public static void main(String[] args)
    {

        ChatRoom chat=new ChatRoom("ChatUT");

        chat.usersInChat.add(new User("George","2401"));

        chat.usersInChat.add(new User("Alexander","4401"));

        chat.AddMessage(new Message(chat.usersInChat.get(0), "Hello!"));

        chat.AddMessage(new Message(chat.usersInChat.get(1), "Hi!"));

        chat.RemoveUser(chat.usersInChat.get(1));

        chat.RemoveMessage(chat.messagesInChat.get(0));

        chat.ChatHistory();

    }
}