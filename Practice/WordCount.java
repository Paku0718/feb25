class WordCount{
	public static int countWords(String str){
		int count = 0;
		boolean inWord = false;
		
		for(int i=0; i<str.length(); i++){
			if(Character.isLetterOrDigit(str.charAt(i))){
				if(!inWord){
					count++;
					inWord=true;
				}
			}else{
				inWord=false;
			}
		}
		return count;
	}

	public static void main(String args[]){
		System.out.println(countWords("paras is boss"));
	}
}