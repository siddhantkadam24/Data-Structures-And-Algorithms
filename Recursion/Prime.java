public class Prime {
    public boolean PrimeOrNot(int num, int div)
    {
        if(num<2)
        {return false;}
        else if(div<=num/2)
        {
            if(num%div==0)
            {return true;}
            else
            {
                return PrimeOrNot(num, ++div);
            }
        }
        return false;
    }
}
