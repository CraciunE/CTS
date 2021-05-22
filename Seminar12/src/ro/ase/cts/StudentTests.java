package ro.ase.cts;

import static org.junit.Assert.*;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

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

		// assertNotEquals(null,student.getNume());
		assertNotNull("Test nume", student.getNume());
		assertNotNull("Test note", student.getNote());
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
		student.adaugaNota((int) nota1);
		student.adaugaNota((int) nota2);
		float medie = student.calculeazaMedie();
		float medieCalculata = (nota1 + nota2) / 2;

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

	@Test
	public void testSetNume() {
		Student student = new Student();
		String nume = "Dorel";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaAruncaExceptie() {
		Student student = new Student();
		student.getNota(-1);
	}

	@Test
	public void testGetNotaAruncaExceptieJUnit3() {
		Student student = new Student();
		// 1
		try {
			// 2
			student.getNota(-1);
			// 3 - nu este executata
			fail("Metoda nu arunca nicio exceptia");
		} catch (IndexOutOfBoundsException e) {
			// 4
		} catch (Exception e) {
			// 5 - nu este executata
			fail("Nu este aruncata o exceptie de tipul IndexOutOfBoundsException");
		}
		// 6
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNoteNegative() {
		Student student = new Student();
		student.adaugaNota(-10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotePreaMari() {
		Student student = new Student();
		student.adaugaNota(100);
	}
}


