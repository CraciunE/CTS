package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicanti;
import ro.ase.cts.clase.readers.ReaderElevi;

public class Program {
	
	public static List<Aplicant> citesteAplicanti( ReaderAplicanti reader) throws FileNotFoundException{
		
		List<Aplicant> listaAplicant = reader.readAplicanti(); 
		return listaAplicant;
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new ReaderAngajati("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
