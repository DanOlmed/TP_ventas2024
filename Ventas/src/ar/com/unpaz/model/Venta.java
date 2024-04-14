package ar.com.unpaz.model;

public class Venta {
	public String id;
	public String fecha;
	public Cliente cliente;
	public String total;
	
	public Venta() {
		
	}
	public Venta(String id) {
		this.id = id;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	public void ventaString() {
		System.out.println("ID: "+this.id+" Fecha: "+this.fecha+" ClienteId: "+this.cliente.id+" Total: "+this.total);
	}
	
	

}
