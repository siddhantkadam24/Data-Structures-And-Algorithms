public class PrintDup {
    public void printDup(String s)
    {
        int count = 0;
        char c[] = new char[s.length()];

        for(int i = 0;i<s.length();i++)
        {   
            boolean dec = false;
            for(int j = i+1;j<s.length();j++)
            {   
                if(java.lang.Character.isLetter(s.charAt(i)))
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        for(int k = 0;k<c.length;k++)
                        {
                            if(s.charAt(i)==c[k])
                            {
                                dec = true;
                                break;
                            }
                        }
                        if(!dec)
                        {
                            c[count++] = s.charAt(i);
                        }
                    }
                }
            }
        }
        System.out.println(java.util.Arrays.toString(c));
    }
}
