package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String numeFisier;
	
	public ReaderAplicanti(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}

	public abstract List<Aplicant> readAplicanti () throws FileNotFoundException;
}
