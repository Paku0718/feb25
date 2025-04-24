import java.util.*;

public class UpperLower{
	public static void main(String args[]){
		String input = "HeLLoWorLD123";
		printUpperAndLower(input);
	}
	
	public static void printUpperAndLower(String str){
		String upperLetters= "";
		String lowerLetters= "";
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)){
				upperLetters += ch;
			} else if(Character.isLowerCase(ch)){
				lowerLetters += ch;
			}
		}
		System.out.println(upperLetters);
		System.out.println(lowerLetters);
		
	}
	
}