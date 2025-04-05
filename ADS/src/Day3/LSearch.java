package Day3;

public class LSearch {
	static int search(int arr[], int x) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]== x) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,50,70,30,20};
		int key = 90;
		//int key = 10;//no of comparisons =1 (Best case)
		//int key = 20;//no of comparisons =5 (Worst case)
		//int key = 70;//no of comparisons =3 (Average case)
		int result = search(arr, key);
		if(result == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found");
		}

	}

}
