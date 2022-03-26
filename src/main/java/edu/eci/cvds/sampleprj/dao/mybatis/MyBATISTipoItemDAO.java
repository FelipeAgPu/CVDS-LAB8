package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import org.apache.ibatis.exceptions.PersistenceException;

import java.util.List;

public class MyBATISTipoItemDAO implements TipoItemDAO {

    @Inject
    private TipoItemMapper tipoItemMapper;

    @Override
    public void save(TipoItem ti) throws PersistenceException {
        try {
            tipoItemMapper.insertarTipoItem(ti);
        }catch (PersistenceException ex){
            throw new PersistenceException("Error al registrar tipo de item"+ti,ex);
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

    @Override
    public List<TipoItem> consultarTipos() throws PersistenceException {
        try{
            return tipoItemMapper.getTiposItems();
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar el los tipos de item",e);
        }
    }
}
