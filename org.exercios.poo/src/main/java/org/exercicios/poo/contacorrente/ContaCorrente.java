package org.exercicios.poo.contacorrente;

import javax.swing.JOptionPane;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 29/09/2023
 * @details Desenvolver uma classe chamada ContaCorrente com os seguintes atributos:
 * conta, agencia, saldo, nomeCliente. Implementar os seguintes métodos:
 * imprimir(), sacar() e depositar().
 * @note Exercício 5 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class ContaCorrente 
{
    // < Atributos da classe >
    public int conta;
    public int agencia;
    public float saldo;
    public String nome_cliente;
    
    // < Método para impressão dos atributos da classe >
    public void imprimir ()
    {
        JOptionPane.showMessageDialog(null, "CONTA CORRENTE:\nConta e agência: " + this.conta + "-" + this.agencia + "\n" + "Saldo: R$" + this.saldo + "\n" + "Nome do cliente: " + this.nome_cliente + "\n", "Conta Corrente | Cadastro", 1);
    }
    
    // < Método para sacar valores >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Retorna valor 1 caso o saque seja realizado;
     * 2. retorna valor 0 caso o saldo seja insuficiente na conta;
     * 3. deverá receber como parâmetro o valor a ser sacado.
     * @param valor Valor que o cliente deseja sacar da sua Conta Corrente.
     * @return 1 para valor sacado / 0 para saldo insuficiente para a operação.
     */
    public int sacar (float valor)
    {
        if (this.saldo < valor)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
    // < Método para depositar valores >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valores.
     * @param valor Valor que o cliente deseja depositar da sua Conta Corrente.
     */
    public void depositar (float valor)
    {
        this.saldo += valor;
    }
}
