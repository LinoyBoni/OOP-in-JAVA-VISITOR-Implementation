
public class PaperFactory {
    public Paper createPaper(String code)
    {
        if (code.equalsIgnoreCase("cn"))
        {
            return new Contract();
        }
        else if (code.equalsIgnoreCase("bk"))
        {
            return  new Book();
        }
        else if (code.equalsIgnoreCase("ac"))
        {
            return new AcademicPaper();
        }
        else if (code.equalsIgnoreCase("jr"))
        {
            return new JournalArticle();
        }
        else
            {
            return null;
        }
    }
}
