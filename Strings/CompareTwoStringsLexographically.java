class CompTwoLexo //CASE SENSITIVE
{
    public static boolean compTwoStrings(String name , String name2)
    {
        boolean dec = true;
        if(name.length()==name2.length())
        {
            for(int i = 0;i< name.length();i++)
            {
                if(name.charAt(i)!=name2.charAt(i))
                {
                    dec = false;
                    break;
                }
            }
        }
	else
	{
		dec = false;
	}
        return dec;
    }  // make use of compareTo() method which compares lexographically means length and elements should be at the same indexes.(case sensitive)
}

