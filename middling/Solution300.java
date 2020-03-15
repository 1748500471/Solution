package middling;

import java.util.Arrays;

/*给定一个无序的整数数组，找到其中最长上升子序列的长度。*/

public class Solution300 {

	public int lengthOfLIS(int[] nums) {
//		if(nums.length<2) {
//			return nums.length;
//		}
//		int[] num=new int[nums.length];
//		Arrays.fill(num, 1);
//		for(int i=1;i<nums.length;i++) {
//			for(int j=0;j<i;j++) {
//				if(nums[j]<nums[i]) {
//					num[i]=Math.max(num[j]+1, num[i]);
//				}				
//			}
//		}
//		int res=num[0];
//		for(int i=0;i<num.length;i++) {
//			//System.out.print(num[i]+" ");
//			res=Math.max(res, num[i]);
//		}
//		return res;
/*dp[i]: 所有长度为i+1的递增子序列中, 最小的那个序列尾数.
  由定义知dp数组必然是一个递增数组, 可以用 maxL 来表示最长递增子序列的长度. 
  对数组进行迭代, 依次判断每个数num将其插入dp数组相应的位置:
  1. num > dp[maxL], 表示num比所有已知递增序列的尾数都大, 将num添加入dp
   数组尾部, 并将最长递增序列长度maxL加1
  2. dp[i-1] < num <= dp[i], 只更新相应的dp[i]*/
        int maxL = 0;
        int[] dp = new int[nums.length];
        for(int num : nums) {
            // 二分法查找, 也可以调用库函数如binary_search
            int lo = 0, hi = maxL;
            while(lo < hi) {
                int mid = lo+(hi-lo)/2;
                if(dp[mid] < num)
                    lo = mid+1;
                else
                    hi = mid;
            }
            dp[lo] = num;
            if(lo == maxL)
                maxL++;
            for(int i=0;i<dp.length;i++) {
            	System.out.print(dp[i]+" ");
            }
            System.out.println();
        }
        return maxL;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution300 s=new Solution300();
		int[] nums= {10,9,2,5,7,8,6};
		System.out.println(s.lengthOfLIS(nums));
	}

}
