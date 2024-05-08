public class RemoveDuplicate {
    
    public void remDup(String s,int i,StringBuilder sb)
    {
        if((i==0 || s.charAt(i) != s.charAt(i-1)))
        {   
            sb.append(s.charAt(i));
            
        }
        i++;
        if(i<s.length())
        {
            remDup(s, i, sb);
        }
    }
}
