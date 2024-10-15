class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        long black=0;
        long ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                ans+=black;
            }
            else{
                black++;
            }
        }
        return ans;
    }
}