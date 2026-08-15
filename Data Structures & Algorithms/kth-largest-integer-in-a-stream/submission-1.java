class KthLargest {
    Queue<Integer> heap;
    int topK;


    public KthLargest(int k, int[] nums) {
        this.topK = k;
        heap = new PriorityQueue<>();
        for(int num: nums){
            heap.offer(num);
            if(heap.size()>k){
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>topK){
            heap.poll();
        }
        return heap.peek();

    }
}
