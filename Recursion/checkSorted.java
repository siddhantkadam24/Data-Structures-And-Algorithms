public class checkSorted {
    public boolean check(int [] arr, int n)
    {
        if(n < arr.length - 1){
            if(arr[n] > arr[n+1])
            {
                return false;
            }
            else{
                return check(arr,++n);
            }
        }
        return true;
    }
}   
