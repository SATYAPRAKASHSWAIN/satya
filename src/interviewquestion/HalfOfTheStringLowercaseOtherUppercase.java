package interviewquestion;

public class HalfOfTheStringLowercaseOtherUppercase {
	public static void main(String[] args) {
		String str="Satyaprakash swain Satyaprakash Swain";
		
		String lowercase=" "; 
		String uppercase=" ";
		
		int mid=str.length()/2;
		
		for (int i = 0; i < str.length(); i++) {
			if(i<mid) {
				lowercase+=Character.toLowerCase(str.charAt(i));	
			}else {
				uppercase+=Character.toUpperCase(str.charAt(i));
			}
			
		}
		System.out.println(lowercase+uppercase);

	}

}
