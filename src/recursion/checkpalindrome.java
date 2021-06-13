package recursion;

public class checkpalindrome {
	public static String check(String str,int si) {
		if(si==str.length()) {
			return "";
		}
		String st=check(str,si+1);
		String strr=st+str.charAt(si);
		return strr;
	}
	public static void main(String args[]) {
		String str="racecar";
		if(check(str,0)==str){
			System.out.println("it is a pallindrome");
		}
		System.out.println(check(str,0));
		System.out.println(str);
		//the code is not correct
	}

}
