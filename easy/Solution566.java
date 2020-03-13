package easy;

/*��MATLAB�У���һ���ǳ����õĺ��� reshape�������Խ�һ����������Ϊ��һ����С��ͬ���¾��󣬵�������ԭʼ���ݡ�
����һ���ɶ�ά�����ʾ�ľ����Լ�����������r��c���ֱ��ʾ��Ҫ���ع��ľ����������������
�ع���ľ�����Ҫ��ԭʼ���������Ԫ������ͬ���б���˳����䡣
������и���������reshape�����ǿ����Һ���ģ�������µ����ܾ��󣻷������ԭʼ����*/

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
