public class SelectionSortAlgoithm {
    /*  in this algorithm we take the first index , then traverse through the array from that present index sequentially.
    after completion of the traversing we store the small value we got by traversing and replace the current index with that of the small index. we continue this by not touching the initial values.
    */
    public int[] selectionSort(int [] a)
    {
        for(int i = 0; i < a.length;i++)
		{
		    int small = i; //initiazlizing small value with present index
		    for(int j = i+1; j < a.length ;j++) // nested for loops for traversing
		    {
		        if(a[i]>a[j]) // if present index value is greater then j index value then compare it with small value.if it is small update it.
		        {
		            if(a[j]<a[small])
		            {
		                small = j;
		            }
		            
		        }
		        if(j==a.length-1)// if we are in the end of the loop then only swap with the smallest value
		            {
		                int temp = a[i];
		                a[i] = a[small];
		                a[small] = temp;
		            }
		        
		    }
		}

        return a; // returning array
    }
}
