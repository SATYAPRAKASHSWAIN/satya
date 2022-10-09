package interviewquestion;

public class SingletondesignPattern {
	
	private static SingletondesignPattern singltonDesign=null;
     private SingletondesignPattern() {
		System.out.println("It is a private constructor");
	}
	public static SingletondesignPattern getInstance() {
		if(singltonDesign == null) {
			singltonDesign=new SingletondesignPattern();
		}
		return singltonDesign;
	}
	
	public void getsingltonDesign() {
		System.out.println("Singleton Design pattern");
	}
	public static void main(String[] args) {
		
		SingletondesignPattern obj1=SingletondesignPattern.getInstance();
		System.out.println(obj1);
		SingletondesignPattern obj2=SingletondesignPattern.getInstance();
		System.out.println(obj2);
		SingletondesignPattern obj3=SingletondesignPattern.getInstance();
		System.out.println(obj3);
		
		obj1.getsingltonDesign();
	}

}
