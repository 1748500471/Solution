package easy;
/*给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。*/

public class Solution169 {

	public int majorityElement(int[] nums) {
		int most=1,s=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==s) {
				most++;
			}else {
				most--;
				if(most==0) {
					s=nums[i+1];
				}
			}
		}
		return s;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution169 s=new Solution169();
		int[] nums= {3,2,3,1,1,1,1,4,4,4,4,4,4,4,4,4};
		System.out.println(s.majorityElement(nums));
	}

}
