public class CountWords {
    public int countingWords(String s)
    {   
        String [] arr = s.split(" ");
        int count = 0;
        
        for(int i= 0;i<arr.length;i++)
        {   
            boolean dec = true;
            for(int j = 0;j<arr[i].length();j++)
            {
                if(!(java.lang.Character.isLetter(arr[i].charAt(j))))
                {
                    dec = false;
                    break;
                }
            }
            if(dec)
            {
                count++;
            }
        }
        return count;
    }
}
