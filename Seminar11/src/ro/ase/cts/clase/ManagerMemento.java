package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> listaMemento;

	public ManagerMemento() {
		super();
		this.listaMemento = new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento) {
		listaMemento.add(memento);
	}
	
	public Memento getMemento(int index) {
		if(index >=0 && index < listaMemento.size()) {
			return this.listaMemento.get(index);
		}else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public Memento getLastIndex() {
		if(listaMemento.size() > 0){
			return this.listaMemento.get(this.listaMemento.size()-1);
			
		}else {
			throw new IndexOutOfBoundsException();
		}
		
	}
	
	
}
