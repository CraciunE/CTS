package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animale;
	
	
	public Zoo() {
		super();
	this.zookeeper= new Zookeeper("Ion");
	this.animale= new ArrayList<>();
	}

	public Zoo(Zookeeper zookeeper, List<Animal> animale) {
		super();
		this.zookeeper = zookeeper;
		this.animale = animale;
	}
	
	public void AdaugareAnimal(Animal a) {
		this.animale.add(a);
	}
	
	public void feedAnimals() {
		for(Animal a : animale) {
			zookeeper.feed(a);
		}
	}
	
	public void deplasareAnimale() {
		for(Animal a : animale) {
			a.merge();
		}
	}
	
	
}
