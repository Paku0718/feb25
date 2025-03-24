public class Q24{
	public static void main(String args[]){
		int i=0;
		for(i=1; i<=100; i++){
			if((i & 1) == 0){
				System.out.println(i + " ");
				
				if(i%2==0){
					System.out.println();
				}
			}
		}
		
	}
}