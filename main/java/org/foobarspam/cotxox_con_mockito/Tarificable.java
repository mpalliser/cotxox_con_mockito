package org.foobarspam.cotxox_con_mockito;

public interface Tarificable {
	public double getCosteDistancia(double distancia);
	public double getCosteTiempo(double minutos);
	public double getCosteTotalEsperado(Carrera carrera);
}
