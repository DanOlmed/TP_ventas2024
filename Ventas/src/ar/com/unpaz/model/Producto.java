package ar.com.unpaz.model;

public class Producto {
	public String id;
	public String nombre;
	public String cantidad;
	public String precio;
	
	public Producto() {
		
	}
	
	public Producto(String id) {
		this.id= id;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public void productosString() {
		System.out.println("ID: "+this.id+" Descripcion: "+this.nombre+" Cantidad: "+this.cantidad+" Precio: "+this.precio);
	}
	
	

}
