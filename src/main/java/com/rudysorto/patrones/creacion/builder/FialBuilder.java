package com.rudysorto.patrones.creacion.builder;

public class FialBuilder extends AutoBuilder {

	@Override
	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(12345);
		motor.setPotencia("12Wet");
		auto.setMotor(motor);
		
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Palio");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Fiat");
		
	}

	@Override
	public void buildPuertas() {
		auto.setCantidadDePuertas(2);
		
	}

}
