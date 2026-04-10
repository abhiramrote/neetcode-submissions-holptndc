class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int min=99999;
        for(int i=0;i<strs.length;i++){
            min=Math.min(min,strs[i].length(
                
            ));
        }
        
        for(int i=0;i<min;i++){
            for(int k=1;k<strs.length;k++){
                if(strs[0].charAt(i)!=strs[k].charAt(i))return ans;
            }
            ans+=strs[0].charAt(i);
        }
        return ans;
               
    }
}