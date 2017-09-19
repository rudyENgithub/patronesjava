package com.rudysorto.patrones.creacion.factorymethod;

public class Main {
	
	public static void main(String[] args) {
		
		try{
		TrianguloFactory factoryTriangulos = new TrianguloFactory();
		Triangulo triangulo =  factoryTriangulos.createTriangulo(110, 110, 110);
		System.out.println(triangulo.getDescription());
		}catch(NullPointerException e){
			System.out.println("El objeto esta null");
			
		}
	}

}
