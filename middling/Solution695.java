package middling;
/*给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)*/

public class Solution695 {

	public int maxAreaOfIsland(int[][] grid) {
		int max=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==1) {
					max=Math.max(dfs(grid,i,j), max);
				}
			}
		}
		return max;
    }
	
	int dfs(int[][] grid,int x,int y) {
		if(x<0||x>=grid.length||y<0||y>=grid[0].length||grid[x][y]==0) {
			return 0;
		}
		grid[x][y]=0;
		int count=1;
		count+=dfs(grid,x+1,y);
		count+=dfs(grid,x,y+1);
		count+=dfs(grid,x-1,y);
		count+=dfs(grid,x,y-1);
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution695 s=new Solution695();
		int[][] grid= {{0,0,1,0,0,0,0,1,0,0,0,0,0},
		               {0,0,0,0,0,0,0,1,1,1,0,0,0},
		               {0,1,1,0,1,0,0,0,0,0,0,0,0},
		               {0,1,0,0,1,1,0,0,1,0,1,0,0},
		               {0,1,0,0,1,1,0,0,1,1,1,0,0},
		               {0,0,0,0,0,0,0,0,0,0,1,0,0},
		               {0,0,0,0,0,0,0,1,1,1,0,0,0},
		               {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		System.out.println(s.maxAreaOfIsland(grid));
	}

}
