package easy;

/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。*/

public class Solution7 {

	public int reverse(int x) {
		long a=0;
		while(x!=0) {
			a=a*10+x%10;
			x=x/10;
		}
		return a>Math.pow(2,31)-1||a<Math.pow(-2, 31)?0:(int)a;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution7 s=new Solution7();
		System.out.println(s.reverse(2147483647));
	}

}
