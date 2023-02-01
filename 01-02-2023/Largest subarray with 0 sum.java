

class GfG
{
    int maxLen(int arr[], int n)
    {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int maxi = 0,sum = 0;
        
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum==0)
            {
                maxi = i+1;
            }
            else
            {
                if(map.containsKey(sum))
                {
                    maxi = Math.max(maxi,i-map.get(sum));
                }
                else
                {
                    map.put(sum,i);
                }
            }
        }
        
        return maxi;
    }
}
