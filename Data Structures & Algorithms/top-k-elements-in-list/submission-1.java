class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> f=new ArrayList<>(map.values());
        Collections.sort(f,Collections.reverseOrder());
        int kth=f.get(k-1);
        List<Integer>res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
           if(i.getValue()>=kth)res.add(i.getKey());
        }
       int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
        
    }
}
