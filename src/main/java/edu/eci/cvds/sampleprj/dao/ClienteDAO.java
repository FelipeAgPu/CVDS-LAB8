package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Cliente;
import org.apache.ibatis.exceptions.PersistenceException;

public interface ClienteDAO {

    public Cliente load(long id) throws PersistenceException;

}
