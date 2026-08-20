class Solution {
    private static int[][] directions = new int[][]{{0,1}, {0,-1}, {-1,0}, {1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length, COLS=grid[0].length;
        int MAX_AREA = 0;

        for(int r=0; r<ROWS; r++){
            for(int c=0; c<COLS; c++){
                int area = dfs(grid, r, c);
                MAX_AREA = Math.max(MAX_AREA, area);
            }
        }

        return MAX_AREA;
        
    }

    private int dfs(int[][] grid, int r, int c){
        if(r<0 || c <0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }

        grid[r][c]=0;
        int area = 1;

        for(int[] dir: directions){
            area+= dfs(grid, r+dir[0], c+dir[1]);
        }
        return area;
    }
}
