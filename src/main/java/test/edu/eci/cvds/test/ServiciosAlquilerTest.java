package test.edu.eci.cvds.test;

import java.util.ArrayList;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ServiciosAlquilerTest {

    @Inject
    ServiciosAlquiler serviciosAlquiler;

    Cliente client;
    Cliente client2;
    ArrayList<ItemRentado> itemsRentados;

    public ServiciosAlquilerTest() {
        serviciosAlquiler = ServiciosAlquilerFactory.getInstance().getServiciosAlquilerTesting();
    }

    @Before
    public void setUp() {
        this.itemsRentados = new ArrayList<ItemRentado>();

        this.client = new Cliente(
                "Nombre",
                100000,
                "1234567",
                "Cra 1",
                "test@email.com",
                false,
                itemsRentados);

        this.client2 = new Cliente(
                "Nombre2",
                200000,
                "9234567",
                "Cra 2",
                "test2@email.com",
                false,
                itemsRentados);

    }

    @Test
    public void emptyDB() {
        for(int i = 0; i < 100; i += 10) {
            boolean r = false;
            try {
                Cliente cliente = serviciosAlquiler.consultarCliente(i);
            } catch(ExcepcionServiciosAlquiler e) {
                r = true;
            } catch(IndexOutOfBoundsException e) {
                r = true;
            }
            // Validate no Client was found;
            Assert.assertTrue(r);
        };
    }

    @Test
    public void consultarCliente() throws ExcepcionServiciosAlquiler {
        serviciosAlquiler.registrarCliente(client);

        Assert.assertEquals(client, serviciosAlquiler.consultarCliente(client.getDocumento()));
    }

    @Test
    public void consultarItemsCliente() throws ExcepcionServiciosAlquiler {
        serviciosAlquiler.registrarCliente(client);

        Assert.assertEquals(client.getRentados(), serviciosAlquiler.consultarCliente(client.getDocumento()).getRentados());
    }

    @Test
    public void consultarClientes() throws ExcepcionServiciosAlquiler {
        serviciosAlquiler.registrarCliente(client);
        serviciosAlquiler.registrarCliente(client2);

        //Assert.assertEquals(new List<Cliente>(), serviciosAlquiler.consultarClientes());
    }

    @Test
    public void consultarItem() {
    }

    @Test
    public void consultarItemDisponible() {
    }

    @Test
    public void consultarMultaAlquiler() {
    }

    @Test
    public void consultarTipoItem() {
    }

    @Test
    public void consultarTiposItem() {
    }

    @Test
    public void registrarAlquilerCliente() {
    }

    @Test
    public void registerClient() throws ExcepcionServiciosAlquiler {
        serviciosAlquiler.registrarCliente(client);

        Assert.assertEquals("Nombre", serviciosAlquiler.consultarCliente(100000).getNombre());
    }

    @Test
    public void consultarCostoAlquiler() {
    }

    @Test
    public void actualizarTarifaItem() {
    }

    @Test
    public void registrarItem() {
    }

    @Test
    public void vetarCliente() {
    }


}