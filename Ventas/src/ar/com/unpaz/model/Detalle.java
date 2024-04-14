package ar.com.unpaz.model;

public class Detalle {
	public String id;
	public Venta venta;
	public Producto producto;
	public String cantidad;
	public String precio;
	
	public Detalle() {
		
	}
	
	public Detalle(String id) {
		this.id=id;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public void detalleString() {
		System.out.println("ID: "+this.id+" IdVenta: "+this.venta.id+" ProductoId: "+this.producto.id+" Precio: "+this.precio);
	}
	
	
	

}
