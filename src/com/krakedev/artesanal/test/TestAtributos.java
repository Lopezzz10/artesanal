package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		Maquina rubia = new Maquina("Pilsener","cerveza rubia",0.02,100000);
		rubia.setNombreCerveza("Golden ale");
		rubia.setDescripcion("cerveza con aroma mas intenso");
		rubia.imprimir();
	}
}
