package java_8_feature;

import java.util.function.Predicate;

public class PredicateDemo_2 {

	public static void main(String[] args) {
      Predicate<Integer> predicate=(t)->{
    	  if(t%2==0) {
    		  return true;
    	  }else {
    		  return false;
    	  }
      };
      System.out.println(predicate.test(4));
		
	}

}
