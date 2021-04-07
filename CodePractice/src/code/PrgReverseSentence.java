package code;

public class PrgReverseSentence {

	public static void main(String args[]){
		
		String Str = "My Name is Ravi";		
		String Revr = "";
		
		String arr[] = Str.split(" ");		
		for(int i=arr.length-1; i>=0 ;i-- ){
			Revr = Revr+" "+arr[i];
		}		
		System.out.println(Revr);
		
		
		
		
				
	}
	
}
