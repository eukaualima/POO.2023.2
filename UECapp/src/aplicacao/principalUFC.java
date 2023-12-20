package aplicacao;

import static java.lang.System.exit;
import java.util.Scanner;
import modelo.Luta;
import modelo.Lutador;

/**
 *
 * @author maver
 */
public class principalUFC 
{
    public static void main(String[] args) 
    {
        int opcao, qt_lutadores, qt_lutas;
        Luta[] luta;
        Lutador[] lutadores;
        
        lutadores = new Lutador[100];
        luta = new Luta[50];
        
        opcao = 0;
        qt_lutadores = 0;
        qt_lutas = 0;
        
        do
        {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("<----------------------<[ U F C ]>---------------------->\n"
                    + "[1]: Criar um lutador\n"
                    + "\t=> Adicione um novo lutador.\n"
                    + "[2]: Ver os lutadores atuais\n"
                    + "\t=> Verifique a lista de lutadores (máx. 100)\n"
                    + "[3]: Marcar uma luta\n"
                    + "\t=> Marque uma luta com um desafiante e um desafiado.\n"
                    + "[4]: Ver lutas marcadas\n"
                    + "\t=> Veja as lutas que estão marcadas.\n"
                    + "[5]: Lutar\n"
                    + "\t=> Escolha uma das lutas marcadas para acontecer.\n\n=> Sua opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao)
            {
                case 0:
                    exit(1);
                    break;
                 
                case 1:
                    criarLutador(lutadores, qt_lutadores);
                    qt_lutadores++;
                    break;
                case 2:
                    if (qt_lutadores == 0)
                    {
                        System.out.println("Não há lutadores.");
                    }
                    else
                    {
                        for (int i = 0; i < qt_lutadores; i++)
                        {
                            System.out.println(i+1 + ". " + lutadores[i].apresentar() + "\n");
                        }
                    }
                    break;
                case 3:
                    if (qt_lutadores == 0)
                    {
                        System.out.println("Não há lutadores.");
                    }
                    else
                    {
                        for (int i = 0; i < qt_lutadores; i++)
                        {
                            System.out.println(i + ". " + lutadores[i].status() + "\n");
                        }
                        luta[qt_lutas] = marcarLuta(luta, lutadores, qt_lutas);
                        qt_lutas++;
                    }
                    break;
                case 4:
                    if (qt_lutas == 0)
                    {
                        System.out.println("Não há lutas marcadas.");
                    }
                    else
                    {
                        for (int i = 0; i < qt_lutas; i++)
                        {
                            System.out.println(i + ". " + luta[i].toString() + "\n");
                        }
                    }
                    break;
                case 5:
                    if (qt_lutas == 0)
                    {
                        System.out.println("Não há lutas marcadas.");
                    }
                    else
                    {
                        for (int i = 0; i < qt_lutas; i++)
                        {
                            System.out.println(i + ". " + luta[i].toString() + "\n");
                        }
                        
                        lutar(luta);
                    }
                    break;
            }
        } while (opcao != 0);
    }
    
    public static Lutador criarLutador(Lutador []vetor_lutadores, int qt_lutadores)
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
        
        System.out.println("O lutador " + lutador.getNome() + " foi criado com sucesso.");
        
        return (vetor_lutadores[qt_lutadores] = lutador);
    }
    
    public static Luta marcarLuta(Luta []vetor_luta, Lutador []vetor_lutadores, int qt_lutas)
    {
        int indice_1, indice_2, retorno, rounds;
        Scanner scanner = new Scanner(System.in);
        
        Luta luta = new Luta();
        
        System.out.println("1) Quem será o desafiante? (informe o índice): ");
        indice_1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("2) Quem será o desafiado? (informe o índice): ");
        indice_2 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("3) Quantos rounds terá a luta?: ");
        rounds = scanner.nextInt();
        scanner.nextLine();
        
        retorno = luta.marcarLuta(vetor_lutadores[indice_1], vetor_lutadores[indice_2]);
        
        if (retorno == 1)
        {
            luta.setDesafiante(vetor_lutadores[indice_1]);
            luta.setDesafiado(vetor_lutadores[indice_2]);
            luta.setRounds(rounds);
            luta.setAprovada(true);
            
            System.out.println("Luta marcada!\n\n" + luta.toString() + "\n\n");
            return luta;
        }
        else
        {
            System.out.println("Tente informar jogadores que sejam diferentes e da mesma categoria.\n");
            return null;
        }
    }
    
    public static Luta lutar(Luta []vetor_luta)
    {
        int indice;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1) Qual luta deseja iniciar?: ");
        indice = scanner.nextInt();
        
        vetor_luta[indice].lutar();
        
        return vetor_luta[indice] = null;
    }
}