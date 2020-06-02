

import java.lang.reflect.Array;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		String type = "AIR";
		
		LogisticFactory logisticFactory = new LogisticFactory();
		LogisticInteface logistic = logisticFactory.getLogistic(type);
		
		System.out.println(logistic.getDescription());
		System.out.println(Arrays.toString(logistic.getTransportations()));
	}

}
