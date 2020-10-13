class Solution {
    public int maximum69Number (int num) {
        
        int max = num;
        String str = Integer.toString(num);
        for (int i =0 ;i <str.length();i++)
        {
            str = Integer.toString(num);
            char a = '6';
            char b ='9';
            if(str.charAt(i)=='6')
            {
                StringBuilder newstr = new StringBuilder(str);
                newstr.setCharAt(i,b);
                int number = Integer.parseInt(newstr.toString());
                if(number>max)
                {
                    max = number;
                }
            }
            if(str.charAt(i)=='9')
            {
                StringBuilder newstr = new StringBuilder(str);
                newstr.setCharAt(i,a);
                int number = Integer.parseInt(newstr.toString());
                if(number>max)
                {
                    max = number;
                }
            }
        }
       return max;   
    }
 
}
