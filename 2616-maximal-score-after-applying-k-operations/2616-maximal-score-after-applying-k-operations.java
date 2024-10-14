class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            heap.offer(num);
        }
        long res=0;
        while(k>0){
            int val=heap.poll();
            res+=val;
            heap.offer((int)Math.ceil(val/3.0));
            k--;
        }
        return res;
    }
}