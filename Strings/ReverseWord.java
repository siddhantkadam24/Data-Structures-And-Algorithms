public class ReverseWord {
    public void reverseWord(String s)
    {
        String [] arr = s.split(" ");
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
