public class removingAllDup {
    public void removeDup(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {  
            boolean b = false;
            for(int j= 0;j<s.length();j++)
            {   
                if(i!=j)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        b = true;
                        break;
                    }
                }   
                
            }
            if(!b)
            {
                sb.append(s.charAt(i));
            }
        }
        String tp = sb.toString();
        System.out.println(tp);
    }
}
