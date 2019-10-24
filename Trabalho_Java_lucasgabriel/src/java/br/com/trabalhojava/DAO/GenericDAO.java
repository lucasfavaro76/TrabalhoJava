package br.com.trabalhojava.DAO;

import java.util.List;

public interface GenericDAO {

    public Boolean cadastrar(Object object);

    public List<Object> listar();

    public Boolean excluir(int idObject);

    public Boolean alterar(Object object);

    public Object carregar(int idObject);
}
