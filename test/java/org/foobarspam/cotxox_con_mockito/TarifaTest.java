package org.foobarspam.cotxox_con_mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TarifaTest {

	@Test
	public void test() {
		Carrera carrera = new Carrera("Mastercard");
		carrera.setDistancia(20.0);
		carrera.setTiempoEsperado(20);
		double costeEsperado = 34;

		Tarificable mockTarifa = mock(Tarifa.class);
		when(mockTarifa.getCosteTotalEsperado(carrera)).thenReturn(costeEsperado);
		carrera.setTarifa(mockTarifa);
		assertEquals(costeEsperado, carrera.getCosteEsperado(), 0.0);
	}
}