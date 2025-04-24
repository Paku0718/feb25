class RemoveVowels{
	public static String deleteVowel(String str){
		String result = "";
		for(int i=0; i<str.length();i++){
			char c = Character.toLowerCase(str.charAt(i));
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		System.out.println(deleteVowel("beautiful"));
	}
}