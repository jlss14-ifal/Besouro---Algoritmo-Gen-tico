
package com.projetos.evolucao;

/**
 *
 * Essa classe serve para implementar as caracteristica da floresta negra em relacao aos besouros
 *
 * @author JOSE LUCAS DOS SANTOS DA SILVA
 * 
 */

import java.util.Random;

import com.projetos.evolucao.Besouro;

public class BesourosNaFlorestaNegra {

	public Besouro[] populacao;
	public final int tamanhoPopulacao = 100;
	public int[] fitnessPopulacao;

	public BesourosNaFlorestaNegra() {
		populacao = new Besouro[tamanhoPopulacao];
		fitnessPopulacao = new int[tamanhoPopulacao];
	}

	public void geraPopulacao() {
		for (int i = 0; tamanhoPopulacao > i; i++)
			populacao[i] = new Besouro();
	}

	public void avaliacaoFitnessPopulacao() {
		for (int i = 0; populacao.length > i; i++)
			fitnessPopulacao[i] = populacao[i].fitness();
	}

	public Besouro selecao() {

		Besouro selecionado = populacao[new Random().nextInt(populacao.length)]; // inicializa com um aleatorio

		int k = 3;
		for (Besouro besouro : populacao) {
			if (besouro.fitness() < selecionado.fitness())
				selecionado = besouro;
			k--;
			if (k < 0)
				break;

		}

		return selecionado;

	}

	public void print() {
		for (Besouro besouro : populacao)
			System.out.println(besouro.getCor().toString());
	}

}
