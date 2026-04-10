class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>>ans=new HashMap<>();
     for(String s:strs){
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String s1=new String(c);
        ans.putIfAbsent(s1,new ArrayList<>());
        ans.get(s1).add(s);
     }
     return new ArrayList<>(ans.values());
    }
}
