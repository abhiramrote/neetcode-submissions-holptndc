class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int n=heights.length-1;
        int i=0;
        while(i<n){
            max=Math.max(max,(n-i)*Math.min(heights[i],heights[n]));
            if(heights[i]<heights[n])i++;
            else n--;
        }
        return max;
        
    }
}
