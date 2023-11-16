package modelo;

public class Caneta 
{
    // < Atributos da classe >
    private int codigo;
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    
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

    // < Getters >
    public int getCodigo() {
        return codigo;
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
    
    // < Setters >
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
