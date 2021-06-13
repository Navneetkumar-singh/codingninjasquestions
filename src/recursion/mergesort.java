package recursion;

public class mergesort {
	
	public static void mergesort(int arr[],int si,int ei) {
		if(si>=ei) {

			return;
		}
	
		int mid=(si+ei)/2;
		mergesort(arr,si,mid);
		
		mergesort(arr,mid+1,ei);
		merge(arr,si,ei);
		
	}
	public static void merge(int arr[],int si,int ei) {
		int mid=(si+ei)/2;

		int i=si;
		int j=mid+1;
		int newar[]=new int[(ei-si)+1];
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				newar[k]=arr[i];
				i++;
				k++;
			}else {
				newar[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			newar[k]=arr[i];
			i++;
			k++;
		}
		while(j<=ei) {
			newar[k]=arr[j];
			j++;
			k++;
		}
		
		
		for( int index=0;index<newar.length;index++) {
			
			arr[si+index]=newar[index];
		}
		
	}
public static void main(String[] args) {
int arrr[]= {7,4,6,3,2};
mergesort(arrr,0,arrr.length-1);
for(int i=0;i<arrr.length;i++) {
	System.out.print(arrr[i]);
}
}
}



