public class Book
{

    protected String BookName;

    protected String AuthorName;

    protected int BookPages;

    public Book(String nameofbook,String author, int pages)
    {

        this.BookName=nameofbook;

        this.AuthorName=author;
        if(pages>0)
        {

            this.BookPages = pages;

        }

        else
        {

            this.BookPages=0;

        }
    }

    public int GetPages()
    {

        return this.BookPages;

    }

    public void SetPages(int numberofpages)
    {

        if(numberofpages>0)
        {

            this.BookPages=numberofpages;

        }

    }

    public void BookInfo()
    {

        System.out.println(BookName+", "+AuthorName+", "+BookPages+" pages.");

    }

}
