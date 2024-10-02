class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        if (n==0){
            return arr;
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=arr[i];
        }
        Arrays.sort(res);
        HashMap<Integer,Integer> map = new HashMap<>();

        int k=1;
        for(int i=0;i<n-1;i++){
            if(res[i]==res[i+1]){
                map.put(res[i],k);
            }
            else{
                map.put(res[i],k++);
            }
        }
        map.put(res[n-1],k);
        //int[] ans = new int[n];
        for(int i=0;i<n;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}