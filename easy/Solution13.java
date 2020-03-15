package easy;

import java.util.HashMap;

/*罗马数字转整数*/
public class Solution13 {

	public int romanToInt(String s) {
		s=s+" ";
		int num=0;
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		hash.put('I', 1);
		hash.put('V', 5);
		hash.put('X', 10);
		hash.put('L', 50);
		hash.put('C', 100);
		hash.put('D', 500);
		hash.put('M', 1000);
		hash.put(' ', 0);
		for(int i=0;i<s.length()-1;i++) {
			if(hash.get(s.charAt(i))>=hash.get(s.charAt(i+1))) {
				num+=hash.get(s.charAt(i));
			}else {
				num+=(hash.get(s.charAt(i+1))-hash.get(s.charAt(i)));
				i++;
			}
		}
		return num;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution13 s=new Solution13();
		System.out.println(s.romanToInt("LVIII"));
	}

}
