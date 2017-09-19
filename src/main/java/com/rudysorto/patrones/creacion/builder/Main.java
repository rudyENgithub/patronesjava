package com.rudysorto.patrones.creacion.builder;

public class Main {
	
	public static void main(String[] args) {
		AutoDirector autodirector = new AutoDirector();
		autodirector.setAutoBuilder(new FialBuilder());
		autodirector.constructAuto();
		Auto auto = autodirector.getAuto();
		
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
	}

}
