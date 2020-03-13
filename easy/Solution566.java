package easy;

/*在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。*/

public class Solution566 {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] nums_x=new int[r][c];
		if(r*c!=nums.length*nums[0].length) return nums;
		int x=0,y=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				if(y-c==0) {x++;y=0;}
				nums_x[x][y]=nums[i][j];
				y++;
			}
		}
		return nums_x;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution566 s=new Solution566();
		int r=1,c=4;
		int[][] nums= { {1,2},
						{3,4}};
		int[][] num=s.matrixReshape(nums, r, c);
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[0].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
