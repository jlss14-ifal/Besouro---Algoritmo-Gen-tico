# Melhor besouro em uma floresta negra com Algoritmo Genético

Descrição do problema:

*Obter, de uma certa população de besouros, aqueles mais adaptados para viver em uma floresta negra.*

Solução em Python: https://github.com/felipealencar/courses/blob/artificial-intelligence/artificial-intelligence/lec-02/algoritmo_genetico_besouro.py

## Resolução

Foram criadas as classes:
- RGB: para ser a característica a ser alterada no besouro;
- Besouro: para representar genericamente um besouro com crossover, fitness e *mutação(ainda não implementado)*;
- BesouroNaFlorestaNegra: para gerenciar o comportamento da população com a criação, avaliação e seleção;
- Mundo: para implementar o algoritmo genético com as classes anteriores.*(vai ser futuramente corrigido)*;
- BesouroApp: para criar o Mundo e o executar.