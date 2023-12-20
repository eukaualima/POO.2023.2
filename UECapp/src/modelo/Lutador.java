/**
 * @author Kauã Lima
 * @since 20/12/2023
*/
package modelo;

public class Lutador 
{
    // < Atributos da classe >    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // < Métodos da classe >
    public String apresentar() 
    {
        return "Lutador{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", categoria=" + categoria + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates + '}';
    }
    
    public String status()
    {
        return "Lutador{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", categoria=" + categoria + '}';
    }
    
    public int ganharLuta()
    {
        System.out.println(this.nome + " venceu a luta.\n");
        return (this.vitorias + 1);
    }
    
    public int perderLuta()
    {
        System.out.println(this.nome + " perdeu a luta.\n");
        return (this.derrotas + 1);
    }
    
    public int empatarLuta()
    {
        System.out.println(this.nome + " empatou a luta.\n");
        return (this.empates + 1);
    }

    // < Métodos e classes >    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getNacionalidade() 
    {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) 
    {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public float getAltura() 
    {
        return altura;
    }

    public void setAltura(float altura) 
    {
        this.altura = altura;
    }

    public float getPeso() 
    {
        return peso;
    }

    public void setPeso(float peso) 
    {
        this.peso = peso;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }

    public int getVitorias() 
    {
        return vitorias;
    }

    public void setVitorias(int vitorias) 
    {
        this.vitorias = vitorias;
    }

    public int getDerrotas() 
    {
        return derrotas;
    }

    public void setDerrotas(int derrotas) 
    {
        this.derrotas = derrotas;
    }

    public int getEmpates() 
    {
        return empates;
    }

    public void setEmpates(int empates) 
    {
        this.empates = empates;
    }
}