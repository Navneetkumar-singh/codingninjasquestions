package recursion;

import java.util.ArrayList;

public class allindexesofx {
	public static int[] indexesofx(int arr[],int n, int si) {
		if(si==arr.length-1) {
			return null;}
			if(arr[si]==n) {
				int ans=si;
			
			}
		int[] ans1=indexesofx(arr,n,si+1);
	 ans1=ans1+ans;
	return ans;
	}
public static void main(String args[]) {
	
}
		
	}


