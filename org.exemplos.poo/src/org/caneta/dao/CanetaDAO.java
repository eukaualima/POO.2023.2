package org.caneta.dao;

import java.util.List;
import org.caneta.aplicacao.Caneta;

public interface CanetaDAO 
{
    public int inserir(Caneta caneta);
    public int editar(Caneta caneta);
    public List<Caneta> listar();
    public Caneta encontrar(int id);
}
