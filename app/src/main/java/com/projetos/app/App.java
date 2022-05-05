
package com.projetos.app;

/**
* 
* Essa classe serve para executar todos os projetos em um mesmo local
* 
* @author JOSE LUCAS DOS SANTOS DA SILVA
* 
*/

import com.projetos.evolucao.BesouroApp;
import com.projetos.demanda.DemandaApp;

public class App {

    public static void main(String[] args) {

	System.out.println("\n\n############################ Algoritmo Genetico - para encontrar melhor besouro para a floresta negra ################################\n\n");

	BesouroApp.main(args);

	System.out.println("\n\n############################ Algoritmo Fuzzy - para determinar demanda futura para uma loja especifica ################################\n\n");

	DemandaApp.main(args);

    }

}
