package org.foobarspam.cotxox_con_mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class ConductorTest{
	Carrera carrera;
	Conductor mockConductor;
	
    @Before
    public void crearCarrera(){
    	carrera = new Carrera("43313456445");
		mockConductor = mock(Conductor.class);
		carrera.setConductor(mockConductor);
    }
	@Test
	public void getNombreConductor(){
		String testNombre = "Mariano";
		when(mockConductor.getNombre()).thenReturn(testNombre);
		assertEquals(testNombre, carrera.getNombreConductor());
	}
	@Test
	public void getMatriculaConductor(){
		String testMatricula = "44424AA";
		when(mockConductor.getMatricula()).thenReturn(testMatricula);
		assertEquals(testMatricula, carrera.getMatriculaConductor());
	}
	@Test 
	public void getModeloConductor(){
		String testModelo = "Micra";
		when(mockConductor.getModelo()).thenReturn(testModelo);
		assertEquals(testModelo, carrera.getModeloConductor());
	}
	@Test 
	public void getOcupadoConductor(){
		boolean testOcupado = false;
		when(mockConductor.isOcupado()).thenReturn(testOcupado);
		assertEquals(testOcupado, carrera.getEstadoConductor());
	}
	@Test
	public void getValoracionConductor(){
		double testValoracion = 4.5;
		when(mockConductor.getValoracion()).thenReturn(testValoracion);
		assertEquals(testValoracion, carrera.getValoracionConductor());
	}
}
