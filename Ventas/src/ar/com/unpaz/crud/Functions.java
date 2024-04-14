package ar.com.unpaz.crud;
import java.util.List;



import ar.com.unpaz.model.*;

public interface Functions {
	
	List<Cliente>getListaClientes();
	List<Venta> getListaVentas();
	
	List<Detalle> getListaDetalles();
	
	List<Producto> getListaProductos();
	List<Informe> getListaInforme();
	
	

}
