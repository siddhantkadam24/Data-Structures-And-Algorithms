public class Cycle {
    public boolean cycleOrNot(String s1,String s2)
    {
        if(s1.charAt(s1.length()-1)== s2.charAt(0))
        {
            if(s1.substring(0, s1.length()-1).equals(s2.substring(1)))
            {
                return true;
            }
        }
        return false;
    }
}
