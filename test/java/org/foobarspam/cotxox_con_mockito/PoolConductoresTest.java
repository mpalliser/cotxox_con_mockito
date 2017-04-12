package org.foobarspam.cotxox_con_mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class PoolConductoresTest {
	Carrera carrera;
	PoolConductoras mockPool;
	Conductor mockConductor;
	@Before
	public void crearObjetos(){
		carrera = new Carrera("4443034340");
		mockPool = mock(PoolConductoras.class);
		mockConductor = mock(Conductor.class);
	}
	@Test
	public void testAsignarConductor() {
		String testNombre = "Samantha";
		when(mockConductor.getNombre()).thenReturn(testNombre);
		assertEquals(testNombre, mockConductor.getNombre());
		when(mockPool.asignarConductor()).thenReturn(mockConductor);
		assertEquals(mockPool.asignarConductor().getNombre(), testNombre);
		
		carrera.setConductor(mockPool.asignarConductor());
		assertEquals(carrera.getNombreConductor(), testNombre);
	}
}