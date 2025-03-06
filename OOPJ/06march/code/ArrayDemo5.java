import java.util.Scanner;

class ArrayDemo5{
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {11,12,23};
		int c[] = {21,22,23};
		
		int arr[][] = new int[3][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.println(" " +arr[i][j]);
			}
			System.out.println();
		}
	}
}