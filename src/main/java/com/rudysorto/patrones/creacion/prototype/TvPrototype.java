package com.rudysorto.patrones.creacion.prototype;

import java.util.HashMap;

public class TvPrototype {

	private HashMap<String, TV> prototipos = new HashMap<String, TV>();

	public TvPrototype() {
		LCD mylcd = new LCD("Sony", "BLACK", 43, 200, 100);
		Plasma myplasma = new Plasma("LG", "Blanca", 55, 250, 2, 3.54);

		addTv("LCD", mylcd);
		addTv("Plasma", myplasma);
	}

	public void addTv(String key, TV value) {

		this.prototipos.put(key, value);

	}

	public void removeTv(String key) {
		this.prototipos.remove(key);
	}

	public Object prototipos(String tipo) throws CloneNotSupportedException {
		return this.prototipos.get(tipo).clone();
	}

}
