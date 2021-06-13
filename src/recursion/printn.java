package recursion;

public class printn {
	static int sumofn(int num) {
		if(num==1) {
			return 1;
		}
		System.out.println(num);
		return sumofn(num-1);
		
	}

}
