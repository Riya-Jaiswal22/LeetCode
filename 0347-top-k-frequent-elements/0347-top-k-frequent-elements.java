class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i,n=nums.length;
        int[] res = new int[k];
        for(i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry :: getValue));

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        i = 0;
        while(!pq.isEmpty()){
            res[i++] = pq.poll().getKey();
        }
        return res;
    }
}