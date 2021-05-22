package ro.ase.cts;

import static org.junit.Assert.*;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import org.junit.Test;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testCunstructorFaraParametru() {
		Student student = new Student();
		
		//assertNotEquals(null,student.getNume());
		assertNotNull("Test nume",student.getNume());
		assertNotNull("Test note",student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		
}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 9;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		float nota1 = 5;
		float nota2 = 10;
		student.adaugaNota((int)nota1);
		student.adaugaNota((int)nota2);
		float medie =  student.calculeazaMedie();
		float medieCalculata = (nota1+nota2)/2;
		
		assertEquals(medieCalculata, medie, 0.001);
	}
	
	@Test
	public void testAreRestanteTrue() {
		Student student = new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		assertTrue(student.areRestante());
	}
	

	@Test
	public void testAreRestanteFalse() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(10);
		assertFalse(student.areRestante());
	}


}
