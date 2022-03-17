package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;

import java.util.List;

/**
 *
 * @author 2106913
 */
public interface ItemRentadoMapper {
    
    
    public List<Item> consultarItemsRentados();
    
    public Item consultarItemRentado(int id);
    
    public void insertarItemRentado(ItemRentado ir);

        
}
