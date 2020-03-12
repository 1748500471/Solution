package easy;
/*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。*/
import java.util.HashMap;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] sub=new int[2];
//		for(int i=0;i<nums.length;i++) {
//			for(int j=nums.length-1;j>i;j--) {
//				if(nums[i]+nums[j]==target) {
//					sub[0]=i;
//					sub[1]=j;
//					return sub;
//				}
//			}
//		}
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hash.containsKey(nums[i])){
				sub[1]=i;
				sub[0]=hash.get(nums[i]);
				return sub;
			}
			hash.put(target-nums[i], i);
		}
		return sub;
    }
	public static void main(String[] args) {
		Solution1 s=new Solution1();
		int[] nums= {2,7,11,15};
		int target=18;
		int[] sub=s.twoSum(nums, target);
		System.out.print(sub[0]+" "+sub[1]);
	}
}
