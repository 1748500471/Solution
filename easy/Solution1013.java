package easy;
/*给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。*/

import java.util.Scanner;

public class Solution1013 {
	
	public boolean canThreePartsEqualSum(int[] A) {
		int sum=0;
		for(int n=0;n<A.length;n++) {
			sum+=A[n];
		}
		if(sum%3!=0) {return false;}
		int a=0,c=0;
		for(int i=0;i<A.length;i++) {
			a+=A[i];
			if(i>=A.length-2&&a!=sum/3) {return false;}
			if(a==sum/3) {
				a=0;
				if(c==1) {return true;}
				c++;
			}
		}
		return false;
    }
	public int[] ThreePartsEqualSum(int[] A) {
		int sum=0;
		int[] nul={-1};
		for(int n=0;n<A.length;n++) {
			sum+=A[n];
		}
		if(sum%3!=0) {return nul;}
		int a=0,c=0;
		int[] b=new int[3];
		for(int i=0;i<A.length;i++) {
			a+=A[i];
			if(i>=A.length-2&&a!=sum/3) {return nul;}
			if(a==sum/3) {
				a=0;
				b[c]=i;
				if(c==1) {return b;}
				c++;
			}
		}
		return nul;
    }
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String str=kb.next().toString();
		String[] arr=str.split(",");
		int[] a=new int[arr.length];
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
			//System.out.print(a[i]+" ");
		}
		Solution1013 s = new Solution1013();
		int[] b=s.ThreePartsEqualSum(a);
		if(b[0]==-1) {
			System.out.println("false");
		}else {
			System.out.println("true");
			int n=0;
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j]);
				if(j==b[n]) {
					System.out.print("=");
					n++;
				}else {
					if(j+1<a.length&&a[j+1]>=0) {
						System.out.print("+");
					}else {
					}
				}
			}
			System.out.println();
		}
		if(s.canThreePartsEqualSum(a)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
