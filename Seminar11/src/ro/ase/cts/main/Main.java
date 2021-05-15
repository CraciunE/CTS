package ro.ase.cts.main;

import ro.ase.cts.clase.ManagerMemento;
import ro.ase.cts.clase.MeciJucat;
import ro.ase.cts.clase.Memento;

public class Main {

	public static void main(String[] args) {
		
		MeciJucat meci1= new MeciJucat("E1", "E2", 12, 13, 14, 15);
		Memento memento =  meci1.creareMemento();
		ManagerMemento manager = new ManagerMemento();
		
		manager.adaugaMemento(memento);
		
		meci1.setNrSpectatori(450);
		meci1.setEchipaGazda("Echipa 23");
		meci1.setEchipaOaspeti("Echipa 24");
		meci1.setNrBilete(55);
		
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getLastIndex());
		System.out.println(meci1.toString());

	}

}
