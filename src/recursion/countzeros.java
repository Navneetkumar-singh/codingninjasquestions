package recursion;

public class countzeros {
	public static int count(int arr[],int si) {
		int count=0;
		if(si==arr.length) {
			return 0;
		}
		if(arr[si]==0) {
		count++;
		}
		int ans=count(arr,si+1)+count;
		return ans;
	}
	public static void main(String args[]) {
		int arr[]= {0,2,4,04,3,0,7};
		
		System.out.println(count(arr,0));
	}

}
