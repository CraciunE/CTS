package ro.ase.cts.observer.state;

public class Maine {

	public static void main(String[] args) {
		
		Masa masa= new Masa(12);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.elibereazaMasa();
	
	}

}
