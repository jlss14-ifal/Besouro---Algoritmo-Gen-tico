package com.projetos.demanda;

/**
* 
* Essa classe serve para executar o algoritmo fuzzy de demanda de uma loja.
* 
* @author JOSE LUCAS DOS SANTOS DA SILVA
* 
*/

import java.io.InputStream;
import java.util.Scanner;

public class DemandaApp {

	public static void main(String[] args) {

		try {

			// Encontra arquivo
			InputStream inputStream = DemandaApp.class.getResourceAsStream("csv/train.csv");

			// Le arquivo
			Scanner scanner = new Scanner(inputStream);

			// Imprime primeira linha
			System.out.println("Linha 1 = " + scanner.nextLine());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
