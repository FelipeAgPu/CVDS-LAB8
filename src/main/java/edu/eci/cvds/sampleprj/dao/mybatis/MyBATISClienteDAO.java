package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Cliente;
import org.apache.ibatis.exceptions.PersistenceException;

import java.util.Date;
import java.util.List;

public class MyBATISClienteDAO implements ClienteDAO {

    @Inject
    private ClienteMapper clienteMapper;


    @Override
    public void save(Cliente cl) throws PersistenceException {
        try{
            ClienteMapper.registrarCliente(cl);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){

            throw new PersistenceException("Error al registrar el cliente "+cl.toString(),e);
        }
    }

    @Override
    public Cliente load(long docu) throws PersistenceException {
        try {
            return clienteMapper.consultarCliente(docu);
        }catch (PersistenceException ex){
            throw new PersistenceException("Error al consultar Cliente"+docu,ex);
        }

    }

    @Override
    public List<Cliente> consultarClientes() throws PersistenceException {
        try{
            return ClienteMapper.consultarClientes();
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar los Clientes ",e);
        }
    }

    @Override
    public void agregarItemRentadoACliente(long id, int idit, Date fechainicio, Date fechafin) throws PersistenceException {
        try{
            ClienteMapper.agregarItemRentadoACliente(id, idit, fechainicio, fechafin);
        }catch(org.apache.ibatis.exceptions.PersistenceException e) {
            throw new PersistenceException("Error al rentar el item", e);
        }
    }
}
