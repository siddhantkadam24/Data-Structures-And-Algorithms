public class Product {
    public int prod(int x, int y)
    {   
        
        if(y>0)
        {
            return x+prod(x, --y);
        }
        return 0;
    }
}
