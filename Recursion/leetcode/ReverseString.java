package leetcode;
public class ReverseString {
    
    int i = 0;int j=0;
    public void reverseString(char[] s) {
        int length = s.length-1;
        if(i<=length-j)        
        {
            char temp = s[i];
            s[i] = s[length-j];
            s[length-j] = temp;
            i++;j++;
            reverseString(s);
            }
        }
    
}
