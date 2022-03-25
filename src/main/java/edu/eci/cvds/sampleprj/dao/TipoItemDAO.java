package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.TipoItem;
import org.apache.ibatis.exceptions.PersistenceException;

public interface TipoItemDAO {

    public void save(String des) throws PersistenceException;

    public TipoItem load(int id) throws PersistenceException;
}
