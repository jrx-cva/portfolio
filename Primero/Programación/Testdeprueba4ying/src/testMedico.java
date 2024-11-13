import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class testMedico {

	static Medico medico1;
	static Medico medico2;
	static Medico medico3;
	static Medico medico4;
	
	static int test_numero;
	
	@BeforeAll
	static void inicializar() {
	
		medico1= new Medico("Pepa",25,"12345678S",2000,18);
		medico2= new Medico("María",35,"98755678S",3000,35);
		medico3= new Medico("Fernando",50,"52463678S",5000,16);
		medico4= new Medico("Pepa",30,"259875678S",2050,40);
		
		test_numero=0;
		
		
	}
	
	@BeforeEach
	void cuentaTest() {
		test_numero++;
	}
	
	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
		
	}
	
	@Test
	public void aumentoDeSalario(){
		assertEquals(true,medico1.numerodeoperacion,"Médico 1 menor de 30 operaciones");
		assertEquals(false,medico2.numerodeoperacion,"Médico 2 mayor de 30 operaciones");
		assertEquals(true,medico3.numerodeoperacion,"Médico 3 menor de 30 operaciones");
		assertEquals(false,medico4.numerodeoperacion,"Médico 4 mayor de 30 operaciones");
	}
	
	@Test
	public void equalscompararNombre() {
		assertEquals(false,medico1.equals(medico2));
		assertEquals(false,medico2.equals(medico3));
		assertEquals(false,medico3.equals(medico4));
		assertEquals(true,medico4.equals(medico1));
	}
	
	@Test
	public void compararDni() {
		assertEquals(false,medico1.dni.compareTo(medico2.dni));
		assertEquals(false,medico2.dni.compareTo(medico3.dni));
		assertEquals(false,medico3.dni.compareTo(medico3.dni));
	}
	
	 @AfterAll
	static void testFin() {
		 System.out.println("se termina con el afterall");
	}
	
	
	
	
}
