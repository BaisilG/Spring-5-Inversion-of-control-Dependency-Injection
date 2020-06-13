package org.baisil.cars;

import org.springframework.stereotype.Component;
import org.baisil.interfaces.Car;

@Component("myCorolla")
public class Corolla implements Car {

	public String specs() {
		return "Sedan from Toyota";
	}

}

// changed to one program to baisil