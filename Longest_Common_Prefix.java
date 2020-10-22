class Solution {
    public String longestCommonPrefix(String[] strs) {
        
         int n = strs.length;
        String out = "";
        if(n==0)
            return out;
        else{
        out = commonPrefix(strs, n);      
            return out;}
        
    }

    static String commonPrefix(String[] arrstr, int len) {
        String prefix = arrstr[0];
        for (int i = 1; i < len; i++) {
            prefix = checkPrefix(prefix, arrstr[i]);
        }
        return prefix;
    }

    static String checkPrefix(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        String ans = "";
        for (int i = 0, j = 0; i < n1 && j < n2; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j))
                break;
            else
                ans = ans + str1.charAt(i);
        }
        return ans;
    }

}
