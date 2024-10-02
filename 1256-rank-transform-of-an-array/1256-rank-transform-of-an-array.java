class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n==0){
            return arr;
        }
        int[] res = Arrays.copyOf(arr,n);
        Arrays.sort(res);
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 1;
        map.put(res[0],k);
        for (int i = 1; i < n; i++) {
            if (res[i] == res[i - 1]) {
                map.put(res[i], k);
            } else {
                map.put(res[i],++k);
            }
        }
        
        for (int i = 0; i < n; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}