package Day3;

public class BSearch {

	static int bsearch(int arr[], int x, int l, int h) {
		if(h>=1) {
			int mid = l+(h-l)/2;
			if(arr[mid]  == x) {
				return mid;
			}
			if(arr[mid]>x) {
				return bsearch(arr,x,mid+1,h);
			}
			return bsearch(arr,x,l,mid-1);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int n = arr.length;
		
		int key = 10;//no of comparisons =1 (Best case)
		//int key = 20;//no of comparisons =5 (Worst case)
		//int key = 70;//no of comparisons =3 (Average case)
		int result = bsearch(arr, key,0,n-1);
		if(result == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found");
		}

	}

}
