package com.rudysorto.patrones.creacion.prototype;

public class Plasma extends TV {

	public Plasma(String marca, String color, int pulgadas, double precio, double anguloVision,
			double tiempoRespuesta) {
		super(marca, color, pulgadas, precio);
		setAnguloVision(anguloVision);
		setTiempoRespuesta(tiempoRespuesta);
		// TODO Auto-generated constructor stub
	}

	private double anguloVision;
	private double tiempoRespuesta;

	public double getAnguloVision() {
		return anguloVision;
	}

	public void setAnguloVision(double anguloVision) {
		this.anguloVision = anguloVision;
	}

	public double getTiempoRespuesta() {
		return tiempoRespuesta;
	}

	public void setTiempoRespuesta(double tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}

}
