package com.rudysorto.patrones.creacion.prototype;

public class LCD extends TV {

	private double costoFabricacion;

	public LCD(String marca, String color, int pulgadas, double precio, double costoFabricacion) {
		super(marca, color, pulgadas, precio);
		setCostoFabricacion(costoFabricacion);
		// TODO Auto-generated constructor stub
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

}
