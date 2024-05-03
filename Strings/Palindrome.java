public class Palindrome {
    public boolean palindromeOrNot(String s)
    {   
        boolean dec = true;
        int i=0,j=s.length()-1;
        char l = s.charAt(i),h = s.charAt(j);
        while(i<=j)
        {
            if(l!=h)
            {   
                dec = false;
                break;
                
            }else{
                i++;j--;
            }
        }
        return dec;
    }
}
