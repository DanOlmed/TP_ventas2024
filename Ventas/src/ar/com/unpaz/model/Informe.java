package ar.com.unpaz.model;

public class Informe {
	
	
	
	public Cliente cliente;
	
	//cantidad corresponde a la clase detalle
	public Detalle detalle;
	//total de ventas corresponde a la clase venta
	public Venta ventas;
	
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}





	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}





	public Detalle getDetalle() {
		return detalle;
	}





	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}





	public Venta getVentas() {
		return ventas;
	}





	public void setVentas(Venta ventas) {
		this.ventas = ventas;
	}





	public void informeToString() {
		
		
		System.out.println("Nombre: "+this.getCliente().getNombre()+" Apellido: "+this.getCliente().getApellido()+" Cantidad de ventas: "+this.getDetalle().getCantidad()+" Total de ventas: "+this.getVentas().getTotal());
		
	}
	
	

	

}
