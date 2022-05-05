
package com.projetos.evolucao;

/**
 *
 * Essa classe serve para "criar um mundo" com uma floresta negra e dentro dela besouros
 *
 * @author JOSE LUCAS DOS SANTOS DA SILVA
 * 
 */


import java.util.List;
import java.util.ArrayList;

import com.projetos.evolucao.Besouro;
import com.projetos.evolucao.BesourosNaFlorestaNegra;

public class Mundo {

	private static Besouro selecionaMelhorDaPopulacao(BesourosNaFlorestaNegra floresta, int index) {
		Besouro melhorBesouro = null;

		//for (int i = index; populacao.length > i; i++)
			

		return floresta.selecao();//melhorBesouro;
			
	}

	public static Besouro algoritmoGenetico(BesourosNaFlorestaNegra floresta, int numGeracoes) {
		
		Besouro melhorBesouro = floresta.populacao[0];
		List<Besouro> filhos;

		for (int i = 0; numGeracoes > i; i++) {

			floresta.avaliacaoFitnessPopulacao();

			// Verifica melhor besouro
			for (Besouro besouro : floresta.populacao)
				if (besouro.fitness() < melhorBesouro.fitness()) {
					melhorBesouro = besouro;
					System.out.println("Melhor besouro atual = " + melhorBesouro.getCor().toString());
				}

			// seleciona os melhores da populacao
			//...

			filhos = new ArrayList<>();

			for (int j = 0; floresta.tamanhoPopulacao > j; j+=2) {
				Besouro progenitor1 = floresta.populacao[j],
						progenitor2 = floresta.populacao[j+1];

				filhos.add(progenitor1.crossover(progenitor2));
				filhos.add(progenitor2.crossover(progenitor1));

			}

			floresta.populacao = new Besouro[filhos.size()];
			floresta.populacao = (Besouro[]) filhos.toArray(floresta.populacao);

		}

		return melhorBesouro;

	}

}

