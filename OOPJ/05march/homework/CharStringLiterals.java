public class CharStringLiterals{
	public static void main(String args[]){
		char ch = 'A';
		String str = "Hello java";
		
		System.out.println("Character Literal: " + ch);
		System.out.println("ASCII value of: " + ch + " is " + (int)ch);
		System.out.println("String Literal: " + str);
		System.out.println("ASCII value of character in string: ");
		
		for(int i=0; i<str.length(); i++){
			System.out.println(" " + str.charAt(i) + " -> " + (int) str.charAt(i));
		}
	}
}