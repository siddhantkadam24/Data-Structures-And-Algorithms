class oneToN {
       
    int a = 1;
    public void printNos(int N)
    {   if(a<=N)
        {
          System.out.print(a++ + " ");
          printNos(N);
        }
    } 
}