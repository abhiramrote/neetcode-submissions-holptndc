class Solution {

    public String encode(List<String> strs) {
        StringBuilder en=new StringBuilder();
        for(String s:strs){
            en.append(s.length()).append('#').append(s);
        }
        return en.toString();
    }

    public List<String> decode(String str) {
        List<String>ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int lend=str.indexOf('#',i);
            int len=Integer.parseInt(str.substring(i,lend));
            i=lend+1;
            String decoder=str.substring(i,i+len);
            ans.add(decoder);
            i+=len;
        }
        return ans;

    }
}
