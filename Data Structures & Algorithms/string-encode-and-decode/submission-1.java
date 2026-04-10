class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode=new StringBuilder();
        for(String str:strs){
            encode.append(str.length()).append('#').append(str);                    
        }
        return encode.toString();

    }

    public List<String> decode(String str) {
        List<String>res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int lEnd=str.indexOf('#',i);
            int len=Integer.parseInt(str.substring(i,lEnd));
            i=lEnd+1;
            String decoder=str.substring(i,i+len);
            res.add(decoder);
            i+=len;
        }
        
        return res;
        


    }
}
