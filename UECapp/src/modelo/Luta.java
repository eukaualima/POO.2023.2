/**
 * @author Kauã Lima
 * @since 20/12/2023
*/
package modelo;

public class Luta 
{
    // < Atributos da classe >    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // < Métodos da classe >
    public int marcarLuta(Lutador lutador_1, Lutador lutador_2)
    {
        if (lutador_1.equals(lutador_2))
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
    public void lutar()
    {
        int random = (int)Math.floor(Math.random() * (120 - 2 + 1) + 2);
         
        if (random % 2 == 0)
        {
            this.desafiante.ganharLuta();
            this.desafiante.perderLuta();
        }
        else if (random % 5 == 0)
        {
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
        }
        else
        {
            this.desafiado.ganharLuta();
            this.desafiado.perderLuta();
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public String toString() {
        return "Luta{" + "desafiado=" + desafiado.getNome() + ", desafiante=" + desafiante.getNome() + ", rounds=" + rounds + ", aprovada=" + aprovada + '}';
    }
    
}