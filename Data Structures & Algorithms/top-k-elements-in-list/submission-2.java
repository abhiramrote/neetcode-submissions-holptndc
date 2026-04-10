class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }

      List<Integer>f=new ArrayList<>(map.values());
      Collections.sort(f,Collections.reverseOrder());

        List<Integer>ans=new ArrayList<>();
        int kth=f.get(k-1);

      for(Map.Entry<Integer,Integer> i:map.entrySet()){
        if(i.getValue()>=kth)ans.add(i.getKey());
      }
      int res[]=new int[ans.size()];
      for(int i=0;i<ans.size();i++){
        res[i]=ans.get(i);
      }
      return res;
        
    }
}
