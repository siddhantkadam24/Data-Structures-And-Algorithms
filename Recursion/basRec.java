public class basRec {   
    public static void main(String [] args)
    {
        message();
    }
    static int i =0;
    public static void message()
    {   
        while(i<5){
        System.out.println("hello world");
        i++;
        message();
        }

    }
    
}
