import java.util.*;

public class reverseString{

	public static void main(String args[]){
		String str = "java";
		String reversed = "";
		
		for(int i= str.length()-1;i>=0;i--){
			reversed = reversed +str.charAt(i);
		}
		
		System.out.println(reversed);
	}
}	