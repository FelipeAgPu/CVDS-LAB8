package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Cliente;
import org.apache.ibatis.exceptions.PersistenceException;

public class MyBATISClienteDAO implements ClienteDAO {

    @Inject
    private ClienteMapper clienteMapper;


    @Override
    public Cliente load(long docu) throws PersistenceException {
        try {
            return clienteMapper.consultarCliente(docu);
        }catch (PersistenceException ex){
            throw new PersistenceException("Error al consultar Cliente"+docu,ex);
        }

    }
}
