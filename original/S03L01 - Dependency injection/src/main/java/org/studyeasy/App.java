package org.baisil;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.baisil.cars.Corolla;
import org.baisil.cars.Swift;
import org.baisil.interfaces.Car;

public class App {

	public static void main(String[] args) {
		//Car swift = new Swift();
		//Car corolla = new Corolla();
		
		//System.out.println(swift.specs());
		//System.out.println(corolla.specs());
		
        
		//Car myCar = new Swift();
		//System.out.println(myCar.specs());
		
		AnnotationConfigApplicationContext context = 
			new	AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("myCorolla",Car.class);
		System.out.println(myCar.specs());
		context.close();
		
	}

}


// changed to oone program to another that is baisil 
