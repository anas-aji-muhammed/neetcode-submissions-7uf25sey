class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0) return new int[][]{newInterval};

        List<int[]> merged = new ArrayList<>();
        boolean inserted = false;

        for(int[] current: intervals){
            //case 1 - current interval will be before the new interval
            if(current[1]<newInterval[0]){
                merged.add(current);
            }
            //case 2 - current comes completely after new interval
            else if(current[0]>newInterval[1]){
                if(!inserted){
                    merged.add(newInterval);
                    inserted=true;
                }
                merged.add(current);
            }
            else{
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }

        if(!inserted){
            merged.add(newInterval);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
