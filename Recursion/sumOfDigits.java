public class sumOfDigits {
    public int sum(int num)
    {   
        if(num!=0)
        {
            return num%10 + sum(num/10);
        }
        return 0;
    }
}
