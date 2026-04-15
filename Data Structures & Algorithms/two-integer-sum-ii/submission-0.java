class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int k=0;
        int l=n-1;
        while(k<l){
             if(numbers[k]+numbers[l]>target)l--;
             else if (numbers[k]+numbers[l]==target)return new int []{k+1,l+1};
             else k++;
        }
           
            
            
        
        return new int[]{};

        
    }
}
