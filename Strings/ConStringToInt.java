public class ConStringToInt {
    public int convert(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            if(java.lang.Character.isDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
        }
        int number = Integer.parseInt(sb.toString());
        return number;
    }
}
