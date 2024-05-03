public class Anagram {
    public boolean anagramOrNot(String s1, String s2)
    {
        boolean dec = false;
        int count  = 0;
        if(s1.length()==s2.length())
        {
            for(int i = 0;i<s1.length();i++)
            {   
                for(int j = 0; j<s1.length();j++)
                {
                    if(s1.charAt(i)==s2.charAt(j))
                    {
                        count++;
                    }
                }
            }
            if(count==s1.length()){
                return dec = true;
            }
        }
        return dec;
    }
}
