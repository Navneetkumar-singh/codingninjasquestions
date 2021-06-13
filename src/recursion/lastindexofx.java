package recursion;

public class lastindexofx {
	public static int lastindex(int arr[],int n,int si)
	{
		if(si==arr.length) {
			return 0;
		}
		
		int ans=lastindex(arr,n,si+1);
		if(ans!=0) {
			return ans;
		}
		if(arr[si]==n) {
			ans=si;
			
		}
		return ans;
	}
	public static void main(String[] args) {
 int arr[]= {1,23,4,5,6,23};
		System.out.println(lastindex(arr,23,0));		
	}
}
