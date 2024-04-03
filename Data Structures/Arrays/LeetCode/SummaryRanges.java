class Solution {
    public List<String> summaryRanges(int[] arr) {
        long startpoint = 0;
        
        int length = arr.length;
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<length; i++)
        {   if(length<=1){
                list.add(Long.toString(arr[i]));
            }
            else{
            if(i!=length-1)
            {
                if(i==0)
                {
                    if(arr[i+1] - arr[i] > 1)
                    {
                        list.add(Long.toString(arr[i]));
                    }
                    else if(arr[i]-arr[i+1]==-1 || arr[i+1] - arr[i] ==1)
                    {
                        startpoint = arr[i];
                    }
                }
                else if(arr[i] - arr[i-1] > 1 && arr[i+1] - arr[i] >1 )
                {
                    list.add(Long.toString(arr[i]));
                }
                else if(arr[i] - arr[i-1] > 1 && arr[i+1] - arr[i] == 1)
                {
                    startpoint = arr[i] ;
                }
                else if((arr[i] - arr[i-1] == 1 || arr[i-1] - arr[i] == -1 )  && arr[i+1] - arr[i] > 1)
                {
                    long endpoint = arr[i];
                    String update = Long.toString(startpoint)+"->"+Long.toString(endpoint);
                    list.add(update);
                }
            }
            else{
                if(arr[i] - arr[i-1] == 1)
                {
                    long endpoint = arr[i];
                    String update = Long.toString(startpoint)+"->"+Long.toString(endpoint);
                    list.add(update); 
                }
                else{
                    list.add(Integer.toString(arr[i]));
                }
            }}
        }
        return list;
    }
}