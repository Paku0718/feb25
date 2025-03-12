Immutable Reference
class FinalDemo6{
	public static void main(String args[]){
		final StringBuilder sb = new StringBuilder("CDAC");
		System.out.println(sb);
		
		sb.append("JUHU-Khargar");
		System.out.println(sb);
	}
}