
import java.util.Arrays;
//note - when frequently calling function causes recursion and then it doesnt satisfy the condition which results in not going in recursion calling and then last statment is executed it traverse back.

//we called sum(a), there come a time where conditon do not satisfies and print statement is called, lets say it gone through recursion 4 times , then last statement aftere the function calling statement is executed also  4 times.
class SumTriangleArray
{
    public void sum(int [] arr)
    {   
        if(arr.length >1)
        {
            int [] a = new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i++) 
            {
                int sum = arr[i]+arr[i+1];
                a[i] = sum;
            }
            sum(a);
        }
        System.out.println(Arrays.toString(arr));
    }
}