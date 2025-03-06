import java.util.Scanner;

class ArrayDemo4{
	public static void main(String args[]){
		//int []arr = new int[5];
		int arr[]={1,2,3,4,5}; //compile time
		//Intitalization of array
		char arr1[]= {'a','d','g','y'};
		byte arr2[] = {1,2,3,4,5,6,7};
		
		//for-each loop
		
		for(int a : arr){
			System.out.println(a);
		}
		
		for(char a1: arr1){
			System.out.println(a1);
		}
	}
}