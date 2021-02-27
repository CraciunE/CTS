package ro.ase.cts;

import clase.Animal;
import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo zoo= new Zoo();
		Animal z1= new Zebra("Mony");
		Animal z2= new Zebra("Marcel");
		Animal g1= new Girafa("Ana");
		Animal g2= new Girafa("Andrei", 500);
		
		zoo.AdaugareAnimal(z1);
		zoo.AdaugareAnimal(z2);
		zoo.AdaugareAnimal(g1);
		zoo.AdaugareAnimal(g2);
		
		zoo.feedAnimals();
		zoo.deplasareAnimale();
		
	}

}
