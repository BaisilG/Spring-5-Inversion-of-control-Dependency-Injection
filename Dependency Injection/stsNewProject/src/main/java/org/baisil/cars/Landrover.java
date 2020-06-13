package org.baisil.cars;

import org.baisil.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("landrover")
public class Landrover implements Car {

	@Override
	
	// we are creating a class by the name of Engine and -- need to create another special class 
	
	Engine engine;
	 // this class will not have main methode 
	
	public String specs() {
		// TODO Auto-generated method stub
		return "form rajan motorss";
	}

}
