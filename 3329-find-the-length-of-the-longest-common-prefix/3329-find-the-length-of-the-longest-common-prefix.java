class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr1){
            while(num>0){
                set.add(num);
                num=num/10;
            }
        }
        int res=0;
        for(int val:arr2){
            while(!set.contains(val) && val>0){
                val=val/10;
            }
            if(val>0){
                res = Math.max(res, (int)Math.log10(val)+1);
            }
        }
        return res;
    }
}