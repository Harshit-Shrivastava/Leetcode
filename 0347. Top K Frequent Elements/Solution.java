class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // build hashmap to track frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // initantiate heap, less frequent element first
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) ->
                                                                 map.get(n1) - map.get(n2));

        // keep k top frequent elements in the heap
        for(int n : map.keySet()) {
            heap.add(n);

            if(heap.size() > k) {
                heap.poll();
            }
        }

        // build output list
        int[] topK = new int[k];
        int i = 0;
        while(!heap.isEmpty()) {
            topK[i++] = heap.poll();
        }

        return topK;
    }
}
