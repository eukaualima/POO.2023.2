/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

import static java.lang.System.exit;
import java.util.Scanner;
import modelo.Lutador;

/**
 *
 * @author maver
 */
public class principalUFC 
{
    public static void main(String[] args) 
    {
        int opcao;
        
        opcao = 0;
        
        do
        {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("""
                               <----------------------<[ U F C ]>---------------------->\n
                               [1]: Criar um lutador\n
                               \t=> Adicione um novo lutador.\n
                               [2]: Marcar uma luta\n
                               \t=> Marque uma luta com um desafiante e um desafiado.\n
                               """);
            opcao = scanner.nextInt();
            
            switch (opcao)
            {
                case 0:
                    exit(1);
                    break;
                 
                case 1:
                    criarLutador();
                    break;
            }
        } while (opcao != 0);
    }
    
    public static Lutador criarLutador()
    {
        Lutador lutador = new Lutador();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1) Informe o nome do lutador: ");
        lutador.setNome(scanner.nextLine());
        
        System.out.println("2) Informe a altura: ");
        lutador.setAltura(scanner.nextFloat());
        scanner.nextLine();
        
        System.out.println("3) Informe a idade: ");
        lutador.setIdade(scanner.nextInt());
        scanner.nextLine();
        
        System.out.println("4) Informe o peso: ");
        lutador.setPeso(scanner.nextFloat());
        scanner.nextLine();
        
        System.out.println("5) Informe a categoria: ");
        lutador.setCategoria(scanner.nextLine());
        
        System.out.println("6) Informe a nacionalidade: ");
        lutador.setNacionalidade(scanner.nextLine());
        
        lutador.setVitorias(0);
        lutador.setDerrotas(0);
        lutador.setEmpates(0);
        
        System.out.println("O lutador " + lutador.getNome() + " foi criado com sucesso.1"
                + "");
        
        return lutador;
    }
}
