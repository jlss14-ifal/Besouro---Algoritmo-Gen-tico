
package com.projetos.evolucao;

/**
 *
 * Essa classe serve para criar de forma simples a caracteristica cor
 *
 * @author JOSE LUCAS DOS SANTOS DA SILVA
 * 
 */

import java.util.Random;

public class RGB {

	public final int R, G, B;

	public RGB() {
		this.R = criaNumeroAleatorio();
		this.G = criaNumeroAleatorio();
		this.B = criaNumeroAleatorio();
	}

	public RGB(int r, int g, int b) {
		this.R = r;
		this.G = g;
		this.B = b;
	}

	private int criaNumeroAleatorio() {
		return new Random().nextInt(255);
	}

	/* getters */

	public String toString() {
		return "[" + this.R + ", " + this.G + ", " + this.B + "]";
	}

}
