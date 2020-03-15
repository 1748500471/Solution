package easy;

/*给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
注意你不能在买入股票前卖出股票。*/
public class Solution121 {

	public int maxProfit(int[] prices) {
//		int target=0;
//		for(int i=0;i<prices.length;i++) {
//			for(int j=prices.length-1;j>i;j--) {
//				if(prices[j]-prices[i]>target) {
//					target=prices[j]-prices[i];
//				}
//			}
//		}
//		if(target>0) {
//			return target;
//		}
//		return 0;
		
		if(prices.length==0) {
			return 0;
		}
		int min=prices[0],max=0;
		for(int i=1;i<prices.length;i++) {
			min=Math.min(min, prices[i]);
			max=Math.max(max, prices[i]-min);
		}
		return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution121 s=new Solution121();
		int[] prices= {7,1,5,3,6,4};
		System.out.println(s.maxProfit(prices));
	}

}
