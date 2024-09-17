class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(String s: s1.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s: s2.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String res = "";
        int k=0;
        for(String s : map.keySet()){
            if(map.get(s)==1){
                res+=s;
                res+=" ";
            }
        }
        if(res==""){
            return new String[0];
        }
        return res.split(" ");
    }
}