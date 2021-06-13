package recursion;

public class multiplication {
	public static int multi(int arr[], int si) {	
if(arr.length==si){
	return 1;
}
     int ans=arr[si]*multi(arr,si+1);
     return ans;
	}
	public static void main(String args[]) {
	int arr[]= {1,2,3,4};
	System.out.println(multi(arr,0));
	}

}
