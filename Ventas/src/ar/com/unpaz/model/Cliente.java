package ar.com.unpaz.model;

public class Cliente {
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	
	public Cliente() {
	}
	
	public Cliente(String id) {
	     this.id = id;
	} 
	
	public Cliente(String id, String nombre) {
	     this.id = id;
	     this.nombre = nombre;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void clienteString() {
		System.out.println("ID: "+this.getId()+" Nombre: "+this.getNombre()+" Apellido: "+this.getApellido()+ " Telefono: "+this.getTelefono());
	}
	
}
