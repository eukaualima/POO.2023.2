package procedimentos.e.funções;
/*
=-----------------=
=-> Importações <-=
=-----------------=
*/
import javax.swing.*;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 20/09/2023
 * @details Faça uma um procedimento que recebe por parâmetro o tempo de duração
 * de uma fábrica expressa em segundos e imprima esse tempo em horas, minutos e 
 * segundos (hh:mm:ss). 
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Cruz
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_4 
{
    // < Função principal >
    public static void main(String[] args) {
        // < Declaração de variáveis locais >
        String formatar;
        int segundos;
        
        segundos = entrada();
        
        formatar = formatacao(segundos);
        
        JOptionPane.showMessageDialog(null, "Segundos informados: " + segundos + "\n\nHora formatada:\n" + formatar);
    }
    
    // < Subprogramas >
    // < Função para coletar o tempo em segundos >
    public static int entrada()
    {
        // < Declaração de variáveis locais >
        String resposta;
        int s;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe o tempo em segundos:", "Conversão de segundos para hh:mm:ss", 3);
        s = Integer.parseInt(resposta);
        
        // < Retorna o valor de segundos >
        return s;
    }
    
    // < Função para formatar os segundos em hh:mm:ss >
    public static String formatacao(int segundos)
    {
        // < Declaração de variáveis locais >
        String formatar;
        int horas, minutos, saldo_resto;
        
        // < Faz as conversões dos segundos para horas, minutos e segundos >
        horas = segundos / 3600;
        saldo_resto = segundos - horas * 3600;
        minutos = saldo_resto / 60;
        segundos = saldo_resto - minutos * 60;
        
        // < Formata a mensagem >
        formatar = horas + ":" + minutos + ":" + segundos;
        
        // < Retorna a hora formatada >
        return formatar;
    }
}
