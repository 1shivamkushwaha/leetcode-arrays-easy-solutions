class Solution {
    public int searchInsert(int[] nums, int target) {
        
       int n = nums.length, m=0;
        for(int i =0; i <n; i++)
        {
            if(nums[i] == target)
            { m = i; break;}
            
            if(nums[i]>target)
            {m = i; break;}
            
            if(i==n-1 && nums[i]<target)
            {m = i+1; break;}   
            
        }
        return m;
    }  
    
}
