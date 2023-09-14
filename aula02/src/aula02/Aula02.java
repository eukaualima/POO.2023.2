// < Pacote que o programa faz parte >
package aula02;

// < Importação de bibliotecas >
import javax.swing.JOptionPane;

// < Classe principal do programa >
public class Aula02 {
    
    // < Função principal do programa >
    public static void main(String[] args) {
        // < Declração de variáveis >
        String nome, resposta, atividade;
        int idade;
        
        // < Atribuição de variáveis >
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        resposta = JOptionPane.showInputDialog("Digite a idade: ");
        atividade = JOptionPane.showInputDialog("Pessoa ativa ou inativa? ");
        idade = Integer.parseInt(resposta);
        
        // < Verifica a atividade e responde o usuário >
        if (!atividade.equalsIgnoreCase("ativa"))
        {
            atividade = "Inativo(a) no sistema";
            
        }
        else if (idade >= 18)
        {
            atividade = "Ativo(a) no sistema e maioridade atingida";
        }
        else if (idade < 18)
        {
            atividade = "Ativo(a) no sistema e maioridade não atingida";
        }
        
        // < Saída de dados >
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nSituação: " + atividade);
    }
    
}
