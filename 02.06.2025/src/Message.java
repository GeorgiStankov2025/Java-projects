public class Message
{

    User messageAuthor;

    protected String messageContent;

    public Message(User author,String content)
    {

        this.messageAuthor=author;

        this.messageContent=content;

    }

}
