package aula02;

import java.util.Scanner;

public class calculadora_correcao {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        loop: do {
            System.out.print("Informe a operação a realizar. Digite:"
                + "\n+ para soma"
                + "\n- para subtrair"
                + "\n* para multiplicar"
                + "\n/ para dividir"
                + "\nSua resposta: ");
            
            char operacao = s.next().charAt(0);
        
            System.out.println("Informe o primeiro operando: ");
            float num1 = s.nextFloat();
            System.out.println("Informe o segundo operando: ");
            float num2 = s.nextFloat();
            
            float resultado;
            
            switch(operacao)
            {
                case '+':
                    resultado = soma(num1, num2);
                    break;
                case '-':
                    resultado = subtracao(num1, num2);
                    break;
                case '*':
                    resultado = multiplicacao(num1, num2);
                    break;
                case '/':
                    resultado = divisao(num1, num2);
                    break;
                default:
                    break loop;
            }
            
            System.out.println("Resultado: " + resultado);
        } while (true);
    }
    
    static float soma(float n1, float n2)
    {
        return n1 + n2;
    }
    
    static float subtracao(float n1, float n2)
    {
        return n1 - n2;
    }
    
    static float multiplicacao(float n1, float n2)
    {
        return n1 * n2;
    }
    
    static float divisao(float n1, float n2)
    {
        return n1 / n2;
    }
}
