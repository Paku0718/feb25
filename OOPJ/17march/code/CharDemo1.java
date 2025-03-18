import java.io.*;
class ChDemo1{
	public static void main(String args[]) throws IOException{
		System.out.println("Enter any character");
		int j = System.in.read();
		System.out.println("Enter char = " + (char)j);
	}
}