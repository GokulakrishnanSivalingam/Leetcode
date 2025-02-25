class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer> av=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
               pq.offer(nums[i]);
        }
        while(!pq.isEmpty())
        {
            av.add(pq.poll());
        } 
        int d=av.get(k-1);
        return d;

    }
}
