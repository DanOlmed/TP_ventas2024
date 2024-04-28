package ar.com.unpaz.principal;
import ar.com.unpaz.model.*;

import ar.com.unpaz.service.*;
import java.util.*;



public class Main {

	public static void main(String[] args) {
		
		menu();
		
		
		
		

	}
	
	public static void menu() {
		int opcion =0;
		do {
		System.out.println("***MENU PRINCIPAL***\n");
		System.out.println("1.Listado de Clientes\n");
		System.out.println("2.Listado de Ventas\n");
		System.out.println("3.Listado de Productos\n");
		System.out.println("4.Listado de Detalles\n");
		System.out.println("5.Informe completo\n");
		System.out.println("6.SALIR\n");
		System.out.println("Seleccionar opcion: ");
		
		
		Scanner ingreso = new Scanner(System.in);
		opcion = ingreso.nextInt();
		
			switch(opcion) {
				case 1:{ listadoClientes();
					break;}
				case 2:{ listadoVentas();
					break;}
				case 3: {listadoProductos();
					break;}
				case 4:{ listadoDetalles();
					break;}
				case 5: {
					System.out.println("***INFORME FINAL***");
					informeFinal();
					
					break;
				}
				
				default:{
					break;}
			}
			
		}while(opcion!=6);
		System.out.println("***FIN DEL PROGRAMA***");
		
	}
	
	public static void listadoClientes() {
		LeerArchivosServicio servicio = new LeerArchivosServicio();
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes = servicio.getListaClientes();
		for(Cliente cliente : listaClientes) {
			cliente.clienteString();
		}
		
	}
	
	public static void listadoVentas() {
		LeerArchivosServicio servicio = new LeerArchivosServicio();
		List<Venta> listaVentas = new ArrayList<Venta>();
		listaVentas = servicio.getListaVentas();
		for(Venta ventas : listaVentas) {
			ventas.ventaString();
		}
		
	}
	public static void listadoDetalles() {
		LeerArchivosServicio servicio = new LeerArchivosServicio();
		List<Detalle> listaDetalles = new ArrayList<Detalle>();
		listaDetalles = servicio.getListaDetalles();
		for(Detalle detalles : listaDetalles) {
			detalles.detalleString();
		}
	}
	
	public static void listadoProductos() {
		LeerArchivosServicio servicio = new LeerArchivosServicio();
		List<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos = servicio.getListaProductos();
		for(Producto producto : listaProductos ) {
			producto.productosString();
		}
		
	}
	public static void informeFinal() {
		LeerArchivosServicio servicio = new LeerArchivosServicio();
		List<Informe>listaInformes = new ArrayList<Informe>();
		listaInformes = servicio.getListaInformes();
		for(Informe inf : listaInformes) {
			inf.mostrarInforme();
		}
		
	}
	
	

}
