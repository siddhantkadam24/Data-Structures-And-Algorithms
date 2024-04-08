class Insertion
{
	public static int[] insertionSort(int [] a)
	{
		
        
        	int k = 0;
        
        	while(k<a.length-1) //As we have to iterate till last index this condition check till length-1 position as we have added k+1, 
        	{
            		int ck = k; //made a copy inorder to iterate back, u will inderstand further in code
            		if(a[k]>a[k+1])//if the current key value is greater than next number.......
            		{
                		int tempk = a[k+1];   //stored the lesser value because we have to iterate back and compare till it reaches its correct position
                
                		do
                		{
                    			int temp = a[ck];//swapping the two above mentioned values
                    			a[ck] = a[ck+1];
                    			a[ck+1] = temp;
                    			ck--; 			//-- because we have to check the current small value with previous values also inorder to form a correct sorted array from left
                		}
                		while(ck >= 0 && tempk  < a[ck] );// checks if copy value is not less than 0 and also check that the current small is lesser than the current copy key value
            		}
            		k++;//incrementing to iterate
        	}
		return a;//returning array
	}
}