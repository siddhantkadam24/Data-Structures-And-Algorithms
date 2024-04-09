public class QuickSortAlgorithm {
    
       public static void quickSort(int [] a, int m, int n)
       {
           if(m<=n)//to break the recursion we compare lowest and high index again,if condition becomes m>n out of the loop.
           {
               int pi = partition(a,m,n);//getting the index of pivot element
               
               quickSort(a,m,pi-1);//it works on left side of the  pivot element
               quickSort(a,pi+1,n);// works on right side of the pivot element
               
           }
           
       }
       
       public static int partition(int [] a, int m, int n )// takes the lowest and highest element, we assign the lowest value of the particular array t0 pivot(it can be anything element at first , last or random)
       {
            int pivot = m;
            while(m<=n)//we check  whether the lowest index is smaller than high index.
            { //if yes...
                if(a[m] <= a[pivot]) // we check till the element of the index is greater than the pivot
                    m++;
                else if(a[n] > a[pivot])// we check till the element of the index is less than the pivot
                    n--;
                else{
                    swap(a,m,n);//if both the above comments satifies we swap that positions.
                    m++;n--;//we increment as to move further in the operation
                }
            }
            swap(a,pivot,n);/*when we are at m>n postion we return n position as it shows the correct index of the pivot element.
            

            */
            
            return n;
       }
       public static void swap(int [] arr,int a, int b) // swapping function
       {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
       }
}
