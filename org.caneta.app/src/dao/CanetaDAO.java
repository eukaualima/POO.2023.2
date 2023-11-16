package dao;

import java.util.List;
import modelo.Caneta;

public interface CanetaDAO 
{
    public int inserir(Caneta contato);
    public int editar(Caneta contato);
    public int apagar(int id);
    public List<Caneta> listar(); // retorna todas as canetas ////// polimorfismo
    public Caneta listar(int id); // retorna uma caneta específica ////// polimorfismo
}
