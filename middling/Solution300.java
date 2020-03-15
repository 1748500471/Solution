package middling;

import java.util.Arrays;

/*����һ��������������飬�ҵ���������������еĳ��ȡ�*/

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
/*dp[i]: ���г���Ϊi+1�ĵ�����������, ��С���Ǹ�����β��.
  �ɶ���֪dp�����Ȼ��һ����������, ������ maxL ����ʾ����������еĳ���. 
  ��������е���, �����ж�ÿ����num�������dp������Ӧ��λ��:
  1. num > dp[maxL], ��ʾnum��������֪�������е�β������, ��num�����dp
   ����β��, ������������г���maxL��1
  2. dp[i-1] < num <= dp[i], ֻ������Ӧ��dp[i]*/
        int maxL = 0;
        int[] dp = new int[nums.length];
        for(int num : nums) {
            // ���ַ�����, Ҳ���Ե��ÿ⺯����binary_search
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
