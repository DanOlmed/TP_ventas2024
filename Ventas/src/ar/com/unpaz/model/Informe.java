package ar.com.unpaz.model;



public class Informe {
	
		Cliente clientes;
		Detalle detalles;
		Venta ventas;
		
		
		public Informe() {
			super();
		}
		
		public Informe(Cliente clientes,Detalle detalles,Venta ventas) {
			super();
			this.detalles=detalles;
			this.clientes=clientes;
			this.ventas=ventas;
		}

		public Cliente getClientes() {
			return clientes;
		}

		public void setClientes(Cliente clientes) {
			this.clientes = clientes;
		}

		public Detalle getDetalles() {
			return detalles;
		}

		public void setDetalles(Detalle detalles) {
			this.detalles = detalles;
		}

		public Venta getVentas() {
			return ventas;
		}

		public void setVentas(Venta ventas) {
			this.ventas = ventas;
		}
		
		public void mostrarInforme() {
			System.out.println("Nombre: "+this.getClientes().getNombre()+" Apellido: "+this.getClientes().getApellido()+" Cantidad de ventas: "+this.getDetalles().getCantidad()+" Total de ventas: "+this.getVentas().getTotal());
			
		}
	
	
	}
