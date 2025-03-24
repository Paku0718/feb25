//check vowel in names


public class vowel
{
	public static void main(String[] args) {
	
  String [] arr= {"omkar","radha","ram"};
  
  int n=arr.length;
  for(int i=0;i<n;i++){
      
      String s=arr[i];
      
      System.out.print(s+":");
     for(int j=0;j<s.length();j++){
         if(s.charAt(j)=='a' || s.charAt(j)=='e'|| s.charAt(j)=='i'|| s.charAt(j)=='o'||s.charAt(j)=='u'){
            System.out.print(  s.charAt(j));
            
         }
         System.out.println();
     }
  }
	 
	}
}