package org.caneta.aplicacao;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 04/10/2023
 * @details Exemplo da criação de classes e objetos.
 * @note Exemplo 1 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class Caneta 
{
    // < Atributos da classe >
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // < Métodos da classe 
    public String escrever ()
    {
        return "Escrevendo...";
    }
    
    public int tampar ()
    {
        // < Declaração de variáveis locais >
        int erro = 0;
        
        // < Validar se está tampada >
        if (!tampada)
        {
            tampada = true;
        }
        else
        {
            erro = 1;
        }
        
        return erro;
    }
    
    public int destampar ()
    {
        // < Declaração de variáveis locais >
        int erro = 0;
        
        // < Validar se está tampada >
        if (tampada)
        {
            tampada = false;
        }
        else
        {
            erro = 1;
        }
        
        return erro;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    @Override
    public String toString() {
        return "" + modelo + " " + cor + " " + ponta + " " + carga + "% " + (tampada ? "Tampada" : "Destampada");
    }
}
