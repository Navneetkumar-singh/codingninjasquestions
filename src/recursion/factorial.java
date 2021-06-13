package recursion;

public class factorial {
	int factorial(int num) {
		
		if(num==0) {
			
			return 1;
		}
		return factorial(num-1)*num;
	}

}
