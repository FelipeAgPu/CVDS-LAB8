package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.ItemRentado;
import org.apache.ibatis.exceptions.PersistenceException;
import java.util.List;

/**
 *
 * @author Imac
 */
public interface ItemRentadoDAO {
    public List<ItemRentado> consultarItemsCliente(long idCliente) throws PersistenceException;
    public ItemRentado consultarItemRentado(int iditem) throws PersistenceException;

}