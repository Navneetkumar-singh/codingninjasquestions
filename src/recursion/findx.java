package recursion;

public class findx {
	int poww(int x,int n) {
		if(n==0) {
			return 1;
			
		}
		return x*poww(x,n-1);
		
		
	}

}
