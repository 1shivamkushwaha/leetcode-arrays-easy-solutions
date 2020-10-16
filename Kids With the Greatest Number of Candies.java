class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        //finding the Max candies
        int max= findMax(candies);
        
        //creating a boolean list and inserting fasle values
        List<Boolean> output = new ArrayList();
        for(int i =0;i<candies.length;i++)
        {
            output.add(false);
        }

        
        output.set(max,true);

        //processing the data
        for(int i =0;i <candies.length;i++)
        {
            if(candies[i]+extraCandies >= candies[max] && output.get(i)!=true )
            {
                output.set(i,true);
            }
        }
        
        //returning the output
        return output;
        
    }   
    
    static int findMax(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;

            }
        }
        return max;
    }

}
