import java.util.Arrays;
class demo
{
    public static void main(String[] args) {
        int [] a = {5,7,8,8,10};
	    int target = 8;
	    int s = 0,e = a.length-1,firstindex = -1,lastindex = -1;
	    
	    while(true)
	    {
	        if(firstindex != -1 && lastindex != -1 )
	        {
	            break;
	        }
	        else
	        {
	            int mid = (s+e)/2;
	            if(a[mid]==target)
	            {
	                if(mid != 0 && mid != a.length-1)
	                {
	                    if(a[mid-1]!=a[mid] && a[mid] == a[mid+1])
	                    {
	                        firstindex = mid;
	                    }
	                    else if(a[mid-1]==a[mid] && a[mid] != a[mid+1])
	                    {
	                        lastindex = mid;
	                    }
	                }
	                else if(mid==0)
	                {
	                   if(a[mid]==a[mid+1])
	                   {
	                    firstindex = mid;
	                    }
	                }
    	            else if(mid==a.length-1)
	                {
	                    if(a[mid-1]==a[mid])
	                    {
	                    lastindex = mid;
	                            }
	                }
	            }
	            else if(a[mid]>target)
	            {
	                e = mid-1;
	            }
	            else
	            {
	                s = mid+1;
	                
	            }
	            
	        }
	    }
		
		int [] arr = {firstindex,lastindex};
		System.out.println(Arrays.toString(arr));
    }
}