class BubbleSortAlgorithm
{
    public int[] bubbleSort(int [] a)
    {
        for(int i = 0; i < a.length-1;i++) // for loops for traversing
		{
		    for(int j = i+1; j < a.length ;j++)
		    {
		        if(a[i]>a[j])// if the present index is greater than the next jth index swap it.
		        {
		           int temp = a[i];
		                a[i] = a[j];
		                a[j] = temp; 
		        }
		    }
		}
        return a;//return array
    }
}