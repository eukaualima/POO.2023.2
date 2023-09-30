package org.exercicios.poo.estoque;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 30/09/2023
 * @details Desenvolver uma classe chamada Estoque com os seguintes atributos:
 * nome_produto, valor e quantidade. Implementar os seguintes métodos:
 * imprimir(), verificarDisponibilidade() e removerProdutos().
 * @note Exercício 11 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class Estoque
{
    // < Atributos da classe >
    public String nome_produto;
    public float valor;
    public int quantidade;
    
    // < Método para impressão dos atributos na tela >
    public void imprimir ()
    {
        System.out.println("Nome do produto: " + this.nome_produto + "\n"
                        + "Valor: R$" + this.valor + "\n"
                        + "Quantidade: " + this.quantidade + "\n");
    }
    
    // < Método para verificar disponibilidade do produto >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Deve retornar um valor inteiro e receber um parâmetro inteiro;
     * 2. deverá retornar 1 caso existam produtos disponíveis ou 0 em caso contrário;
     * 3. a existência de produtos significa que o atributo tem quantidade maior que 0 e maior ou igual ao parâmetro recebido.
     * @param valor Valor de produtos que o usuário informou.
     * @return 1 para possui disponiblidade / 0 caso contrário.
     */
    public int verificarDisponibilidade (int valor)
    {
        if (this.quantidade > 0 && this.quantidade >= valor)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    // < Método para remover produtos >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Deve retornar um valor inteiro e receber um parâmetro com a quantidade de elementos que serão removidos;
     * 2. antes da remoção deve-se verificar a disponibilidade do produto solicitado. Para isso, executar o método verificarDisponibilidade();
     * 3. caso retorne 1, o método removerProdutos() poderá diminuir o valor recebido como parâmetro do total do atributo quantidade;
     * 4. caso contrário, retornar 0.
     * @param valor Valor de produtos que o usuário informou.
     * @return 1 para removido com sucesso / 0 para não removido.
     */
    public int removerProdutos (int valor)
    {
        if (verificarDisponibilidade(valor) == 1)
        {
            this.quantidade -= valor;
            
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
