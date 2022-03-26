package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Cliente;
import org.apache.ibatis.exceptions.PersistenceException;

import java.util.Date;
import java.util.List;

public interface ClienteDAO {
    public void save(Cliente cl) throws PersistenceException;

    public Cliente load(long doc) throws PersistenceException;

    public List<Cliente> consultarClientes() throws PersistenceException;

    public void agregarItemRentadoACliente(long id,
                                           int idit,
                                           Date fechainicio,
                                           Date fechafin)throws PersistenceException;
}
