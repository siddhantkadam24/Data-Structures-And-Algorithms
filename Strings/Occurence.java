public class Occurence {
    int count = 0;
    public char getOcc(String s)
    {   
        int maxcount = 0;
        char maxchar = 0;
        
        char [] c= getUnique(s);
        for(int i = 0;i<count;i++)
        {   int counter = 0;
            for(int j = 0;j<s.length();j++)
            {
                    if(c[i] == s.charAt(j))
                    {
                        counter++;
                    }
            }
            if(maxcount<counter)
            {
                maxcount = counter;
                maxchar = c[i];
            }
        }
        return maxchar;
    }

    public char[] getUnique(String s)
    {   
        
        char [] u = new char[s.length()];
        
        for(int i = 0;i<s.length();i++)
        {   
            boolean b = false;
            for(int j = 0;j<u.length;j++)
            {
                if(s.charAt(i)==u[j])
                {
                    b = true;break;
                }
            }
            if(!b)
            {
                u[count++] = s.charAt(i);
            }
        }
        return u;
    }
}
