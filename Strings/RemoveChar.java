public class RemoveChar {
    public void remChar(String s, char c)
    {
        for(int i = 0;i<s.length();i++)
        {
            if(c!=s.charAt(i))
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
