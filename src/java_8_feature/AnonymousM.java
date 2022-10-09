package java_8_feature;

interface Calculator{
	//void show();
	
	//void sum(int input);
	
	int substract(int i1,int i2);
}

public class AnonymousM {

	public static void main(String[] args) {
		/*
		 * Calculator calculator = () -> System.out.println("Satya, ");
		 * 
		 * calculator.show();
		 */
		/*
		 * Calculator calculator = (input)->System.out.println("Sum : "+input);
		 * 
		 * calculator.sum(2323);
		 */
		
		
		Calculator calculator = ( i1, i2)->{
			if(i1<i2) {
				throw new RuntimeException("Message");
			}
			else {
			return 	i2-i1;
			}
		};
	    System.out.println(calculator.substract(111,98));
	}

}
