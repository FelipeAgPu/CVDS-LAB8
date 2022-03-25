package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import org.apache.ibatis.exceptions.PersistenceException;

public class MyBATISTipoItemDAO implements TipoItemDAO {

    @Inject
    private TipoItemMapper tipoItemMapper;

    @Override
    public void save(String des) throws PersistenceException {
        try {
            tipoItemMapper.addTipoItem(des);
        }catch (PersistenceException ex){
            throw new PersistenceException("Error al registrar tipo de item"+des,ex);
        }
    }

    @Override
    public TipoItem load(int id) throws PersistenceException {
        try {
            return tipoItemMapper.getTipoItem(id);
        }catch (PersistenceException ex){
            throw new PersistenceException("Error al consultar tipo de item"+id,ex);
        }
    }
}
