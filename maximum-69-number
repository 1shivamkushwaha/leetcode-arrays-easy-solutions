class Solution {
    public int maximum69Number (int num) {
        
        //copying the num
        int max = num;
        
        //creating a array for num
        int[] arr = Int_to_array(num);

        

        for(int i =0 ; i <arr.length;i++)
        {
              //intializing to the original num
              arr = Int_to_array(num);


            if(arr[i]==6)
            {
                //replacing
                arr[i]=9;
                
                //converting back to integer type
                int n = Array_to_int(arr);
                
                //check
                if(n>max)
                {
                    max=n;

                }
            }

            if(arr[i]==9)
            {
                //replacing
                arr[i]=6;
                //converting back to integer type
                int n = Array_to_int(arr);
                //check
                if(n>max)
                {
                    max=n;

                }
            }

        }
       return max;
        
        
    }
    
    //coverting array into integer
    static int Array_to_int(int[] arr)
    {
        int i, k = 0;
        for (i = 0; i < arr.length; i++)
        {k = 10 * k + arr[i];}

        return k;
    }
    
    
    //coverting integer to array
    static int[] Int_to_array(int n)
    {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        return arr;
    }
    
}
