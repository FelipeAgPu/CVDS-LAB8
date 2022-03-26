package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author 2106913
 */
public interface ItemRentadoMapper {
    
    
    public List<Item> consultarItemsRentados();

    public List<ItemRentado> consultarItemsCliente(@Param("idc")long idcliente);
    public ItemRentado consultarItemRentado(@Param("idit")int iditem);
    
    public void insertarItemRentado(ItemRentado ir);

        
}
