package recursion;

public class firstindex {
public static int findindex(int arr[],int x,int si) {
	if(si==arr.length) {
		return -1;
	}
	if(arr[si]==x) {
		return si;
	}
	int ans=findindex(arr,3,si+1);
	return ans;
}
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6,7};
	System.out.println("Array found at index "+" "+findindex(arr,3,0));
}
}
