package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorie.teste.TesteGetPromovabilitate;
import ro.ase.cts.categorie.teste.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.mockuri.StudentDummy;
import ro.ase.cts.clase.mockuri.StudentFake;
import ro.ase.cts.clase.mockuri.StudentStub;

public class TesteGrupa {
@Category(TesteUrgente.class)
	@Test
	public void testAdaugareStudent() {
		StudentDummy studentD= new StudentDummy();
		Grupa grupa = new Grupa(1078);
		
		grupa.adaugaStudent(studentD);
		assertEquals(1, grupa.getStudenti().size());
	}
	
	@Category(TesteGetPromovabilitate.class)
	
	@Test
	public void testGetPromovabilitate() {
		StudentStub studentS= new StudentStub();
		Grupa grupa = new Grupa(1078);
		
		grupa.adaugaStudent(studentS);
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1078);
		
		for( int i=0; i<7; i++)
		{
			StudentFake student = new StudentFake();
			student.setValoareAreRestanta(false);
			grupa.adaugaStudent(student);
		}
		for(int i =0; i<3; i++) {
			StudentFake student= new StudentFake();
			student.setValoareAreRestanta(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7, grupa.getPromovabilitate(),0.01);
	}
	
	

}
