package recursion;

public class sumofdigits {
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int sum=n%10;
		int ans=sum(n/10);
		return sum+ans;
	}
public static void main(String args[]) {
	System.out.println(sum(12345));
}
}
