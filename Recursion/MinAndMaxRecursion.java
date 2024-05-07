public class MinAndMaxRecursion {
    public void maxandmin(int [] arr,int min,int max,int count)
    {
        if (count==arr.length) 
        {   System.out.println(arr[min]+" "+arr[max]);
            return ;} //this is to exit recursion when base condition is met(base condition is used to exit the recusrion loop)
        if(arr[count]<arr[min])
        {
            min = count;
        }
        if(arr[count]>arr[max])
        {
            max = count;
        }
        count++;
        maxandmin(arr,min,max,count);
    }
}
