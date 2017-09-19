package com.rudysorto.patrones.creacion.factorymethod;

public class Equilatero extends Triangulo {

	public Equilatero(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "soy un equilatero";
	}

	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dibujate() {
		// TODO Auto-generated method stub
		
	}

}
