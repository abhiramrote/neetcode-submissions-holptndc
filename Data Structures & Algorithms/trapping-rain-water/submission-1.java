class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=h[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(h[i],l[i-1]);
        }
        r[n-1] = h[n-1];
        for(int i=h.length-2;i>=0;i--){
            r[i]=Math.max(r[i+1],h[i]);
        }
        int w=0;
        for(int i=0;i<h.length;i++){
            w+=Math.min(l[i],r[i])-h[i];
        }
        return w;
        
    }
}
