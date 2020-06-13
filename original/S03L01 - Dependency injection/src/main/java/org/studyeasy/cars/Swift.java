package org.baisil.cars;

import org.springframework.stereotype.Component;
import org.baisil.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}
			// changed to that program to the baisil
			