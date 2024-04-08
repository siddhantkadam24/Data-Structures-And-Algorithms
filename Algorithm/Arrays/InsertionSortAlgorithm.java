class Insertion
{
	public static int[] insertionSort(int [] a)
	{
		int [] a = {7, 12, 9, 11, 3};
        
        	int k = 0;
        
        	while(k<a.length-1)
        	{
            		int ck = k;
            		if(a[k]>a[k+1])
            		{
                		int tempk = a[k+1];
                
                		do
                		{
                    			int temp = a[ck];
                    			a[ck] = a[ck+1];
                    			a[ck+1] = temp;
                    			ck--;
                		}
                		while(ck >= 0 && tempk  < a[ck] );
            		}
            		k++;
        	}
		return a;
	}
}