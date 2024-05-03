import java.lang.Character;
class IndexOfAllChar
{
    public void indexOfAllChar(String demo)
    {
        for(int i =0 ; i<demo.length();i++)
        {
            if(Character.isLetter(demo.charAt(i)))
            {
                System.out.println(demo.charAt(i)+"->"+i);
            }
        }
    }
}