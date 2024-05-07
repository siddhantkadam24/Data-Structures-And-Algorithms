public class BasicNum {
    public void tpnum(int i)
    {
        System.out.println(i++);
        if(i<6)
        {
            tpnum(i);
        }
    }
}
