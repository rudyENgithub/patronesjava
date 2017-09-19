package com.rudysorto.patrones.creacion.prototype;

public class Cliente {

	public static void main(String[] args) throws CloneNotSupportedException {

		TvPrototype tvp = new TvPrototype();
		TV mytv = (TV) tvp.prototipos("LCD");

		System.out.println(mytv.getPrecio());

	}

}
