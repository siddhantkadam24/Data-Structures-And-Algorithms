class BinarySearch
{	
	public static void binarySearchAlgorithm(int[] a)
	{
		int s = 0; int e = a.length-1;// First we take start and endpoints of the array
		int target = 23;//value to find
		
		while(true) //infinite loop till condition is satisfied or we put "break"
		{
			int mid = (s+e)/2; // we put mid in the loop as we have to initialize it multiple times
		
			if(a[mid] == target){   // if target is same as the value of mid print and 	break the statement
		 		System.out.println(target+" at "+mid+" index");
		        	break;
			}else if(a[mid] > target){  //if mid value is greater than target value then we can say that target value is on the left side of the array range, so we initialize e to mid -1
				e = mid-1;
			}else{	//if mid value is less than target value then we can say that target value is on the right side of the array range, so we initialize s to mid+1
		        s = mid+1;
			}
		}
	}
}