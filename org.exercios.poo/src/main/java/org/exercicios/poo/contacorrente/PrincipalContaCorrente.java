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
 * @details Desenvolver uma segunda classe Java chamada PrincipalContaCorrente.
 * @note Exercício 8 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalContaCorrente 
{
    
    /**
     * -> Regras para o main dadas pelo exercício:
     * 1. Deverá criar um loop para o usuário escolher entre as opções cadastrar, sacar, depositar ou consultar;
     * 2. Se for selecionada a opção sacar, executar o método execSaque();
     * 3. se a opção for depositar, executar o método execDeposito();
     * 4. se a opção for consultar, executar o método execConsulta();
     * 5. se a opção for cadastrar, executar o método execCadastro().
     */
    public static void main(String[] args) 
    {
        // < Declaração de variáveis locais >
        String resposta;
        int opcao;
        
        // < Cria um novo objeto >
        ContaCorrente conta_corrente = new ContaCorrente();
        
        // < Entrada de dados >
        //conta_corrente.nome_cliente = JOptionPane.showInputDialog(null, "Qual seu nome?", "Conta Corrente | Nome do Cliente", 3);
        
        // < Cria um loop para o menu da conta corrente e entrada de dados >
        loop: while (true)
        {
            resposta = JOptionPane.showInputDialog(null, "Qual opção deseja acessar?\n1) Cadastrar uma nova conta corrente;\n2) Consultar uma conta corrente;\n3) Fazer saque;\n4) Fazer depósito;\n5) Sair do menu.\n\nInforme abaixo a opção que deseja acessar de 1 a 5:", "Conta Corrente | Menu Principal", 1);
            opcao = Integer.parseInt(resposta);
            
            switch (opcao)
            {
                case 1: 
                    execCadastro(conta_corrente);
                break;
                case 2: 
                    execConsulta(conta_corrente);
                break;
                case 3:
                    execSaque(conta_corrente);
                break;
                case 4: 
                    execDeposito(conta_corrente);
                break;
                case 5: 
                break loop;
                default:
                break loop;
            }
        }
        
    }
    
    public static void execCadastro(ContaCorrente conta_corrente)
    {
        // < Declaração de variáveis locais >
        String resposta;
        
        // < Entrada de dados do cadastro >
        resposta = JOptionPane.showInputDialog(null, "CADASTRO DE CONTA CORRENTE\nEtapa 1 de 3.\n\nInforme o NOME da Conta Corrente:", "Conta Corrente | Cadastro", 3);
        conta_corrente.nome_cliente = resposta;
        
        resposta = JOptionPane.showInputDialog(null, "CADASTRO DE CONTA CORRENTE\nEtapa 2 de 3.\n\nInforme a NUMERAÇÃO da Conta Corrente:", "Conta Corrente | Cadastro", 3);
        conta_corrente.conta = Integer.parseInt(resposta);
        
        resposta = JOptionPane.showInputDialog(null, "CADASTRO DE CONTA CORRENTE\nEtapa 3 de 3.\n\nInforme a AGÊNCIA da Conta Corrente:", "Conta Corrente | Cadastro", 3);
        conta_corrente.agencia = Integer.parseInt(resposta);
        
        JOptionPane.showMessageDialog(null, "CADASTRO DE CONTA CORRENTE\nEtapas finalizadas.", "Conta Corrente | Cadastro", 1);
    }
    
    public static void execConsulta(ContaCorrente conta_corrente)
    {
        conta_corrente.imprimir();
    }
    
    public static void execSaque(ContaCorrente conta_corrente)
    {
        // < Declaração de variáveis locais >
        String resposta;
        float valor;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Saldo: R$" + conta_corrente.saldo + "\n\nQuanto deseja sacar?", "Conta Corrente | Saque", 3);
        valor = Float.parseFloat(resposta);
        
        // < Faz (ou não) o saque >
        if (conta_corrente.sacar(valor) == 1)
        {
            conta_corrente.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado.\nNovo saldo: R$" + conta_corrente.saldo, "Conta Corrente | Saque", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saque NÃO realizado.", "Conta Corrente | Saque", 1);
        }
    }
    
    public static void execDeposito(ContaCorrente conta_corrente)
    {
        // < Declaração de variáveis locais >
        String resposta;
        float valor;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Saldo: R$" + conta_corrente.saldo + "\n\nQuanto deseja sacar?", "Conta Corrente | Depósito", 3);
        valor = Float.parseFloat(resposta);
        
        // < Faz o depósito >
        conta_corrente.depositar(valor);
        
        JOptionPane.showMessageDialog(null, "Depósito realizado.", "Conta Corrente | Depósito", 1);
    }
}
