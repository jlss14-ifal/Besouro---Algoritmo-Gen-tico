
package com.projetos.evolucao;

/**
 *
 * Essa classe serve para implementar as caracteristicas e capacidades de um besouro
 *
 * @author JOSE LUCAS DOS SANTOS DA SILVA
 * 
 */

import com.projetos.evolucao.RGB;

public class Besouro {

	private final RGB cor;

	public Besouro() {
		this.cor = new RGB();
	}

	public Besouro(RGB cor) {
		this.cor = cor;
	}
	
	public Besouro crossover(Besouro besouro) {
		return new Besouro( new RGB(0, besouro.getCor().G, besouro.getCor().B) );
	}

	public int fitness() {
		return (cor.R + cor.G + cor.B);
	}

	public RGB getCor() {
		return this.cor;
	}

}
