package org.baisil;

import org.baisil.cars.Innova;
import org.baisil.cars.Landrover;
import org.baisil.interfaces.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car innova = new Innova();
		Car landrover = new Landrover();
		//innova.specs();
		//landrover.specs();
		
		System.out.println(innova.specs());
		System.out.println(landrover.specs());
		
		// creating another car object 
		
		Car myCar = new Innova();
		System.out.println(myCar.specs());
	}

}
