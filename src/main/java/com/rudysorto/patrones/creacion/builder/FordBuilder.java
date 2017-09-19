package com.rudysorto.patrones.creacion.builder;

public class FordBuilder extends AutoBuilder {

	@Override
	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(78945);
		motor.setPotencia("33Rss1");
		auto.setMotor(motor);
		
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Focus");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Marca");
		
	}

	@Override
	public void buildPuertas() {
		auto.setCantidadDePuertas(4);
		
	}

}
