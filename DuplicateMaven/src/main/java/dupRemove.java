public class dupRemove {
	public int[] removeduplicates(int[] arr) 
	{
	    int i,j,k,p,count=0;
	    j=0;
	    int total=arr.length;
	    int n=total;
	    for(i=1;i<total;i++)
	    {
	        if(arr[j]!=arr[i])
	            j++;
	        else
	        {
	           while(i<total && arr[j]==arr[i] )
	           {
	                i++;
	                count++;
	           }                
	           for(k=j+1,p=i;p<total;p++,k++)
	                arr[k]=arr[p];
	           j++;
	           i=j;
	        }
	        total=total-count;            
	        count=0;            
	    }
	    makeZero(arr, total, n);

	    return arr;
	}

	private void makeZero(int[] arr,final int total,final int n) {
		int i;
		for(i=total;i<n;i++)
	    	arr[i]=0;
		return;
	}

}
