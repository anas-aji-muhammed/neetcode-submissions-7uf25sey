class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        for(int[] interval: intervals){
            int lastMergedIndex = merged.size()-1;
            if(merged.isEmpty() || merged.get(lastMergedIndex)[1]< interval[0]){
                merged.add(interval);
            }
            else{
                merged.get(lastMergedIndex)[1] = Math.max(merged.get(lastMergedIndex)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
