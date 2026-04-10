class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
        HashMap<Integer,Integer>map=new HashMap<>();
          for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>ans=new ArrayList<>();
        List<Integer>f=new ArrayList<>(map.values());
        Collections.sort(f,Collections.reverseOrder());
        int kth=f.get(k-1);
      
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
          if(entry.getValue()>=kth)ans.add(entry.getKey());
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<arr.length;i++){
          arr[i]=ans.get(i);
        }
        return arr;
    }
}
