package org.baisil.cars;

import org.baisil.interfaces.Car;
import org.springframework.stereotype.Component;


@Component("innova")
public class Innova implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "from Baisil motors";
	}

}
