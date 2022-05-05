
package com.projetos.evolucao;

/**
 *
 * Essa classe serve para testar o funcionamento do algoritmo genetico
 *
 * @author JOSE LUCAS DOS SANTOS DA SILVA
 * 
 */

import com.projetos.evolucao.Besouro;
import com.projetos.evolucao.Mundo;
import com.projetos.evolucao.BesourosNaFlorestaNegra;

public class BesouroApp {

    public static void main(String[] args) {

	int numGeracoes = 10000;

	BesourosNaFlorestaNegra floresta = new BesourosNaFlorestaNegra();

	floresta.geraPopulacao();
	floresta.print();

	System.out.println("\n-------------\n");

	Mundo mundo = new Mundo();

	Besouro melhorBesouro = mundo.algoritmoGenetico(floresta, numGeracoes);

	System.out.println("\n-------------\n");

	System.out.println("O melhor besouro foi: " + melhorBesouro.getCor().toString());

    }
}
