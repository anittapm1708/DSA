class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            heap.offer(num);
        }
        long res=0;
        while(!heap.isEmpty() &&k>0){
            res+=heap.peek();
            int val = (int)Math.ceil(heap.poll()/3.0);
            heap.offer(val);
            k--;
        }
        return res;
    }
}