class Ass16 {
	public static void main(String args[]){
		int number = 17;
		
		boolean isPrime = true;
		if(number<=1){
			isPrime = false;
		}else{
			for(int i=2; i<=Math.sqrt(number); i++){
				if(number % i ==0){
					isPrime = false;
					break;
				}
			}
		}

		if(isPrime){
			System.out.println("The number " + number + " is Prime");
		}else{
			System.out.println("The number " + number + " is not Prime");
		}
	}
}