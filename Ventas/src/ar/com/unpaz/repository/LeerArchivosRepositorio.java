package ar.com.unpaz.repository;

import java.util.*;

import java.io.*;
import ar.com.unpaz.crud.*;
import ar.com.unpaz.model.*;


public class LeerArchivosRepositorio implements Functions {

	public List<Cliente> getListaClientes() {
		//Aqui va la ruta específica del archivo a leer
		File clienteFile = new File("C:\\Users\\giser\\OneDrive\\Escritorio\\TP_Ventas\\cliente.txt");
		List<Cliente> sListClientes = new ArrayList<Cliente>();
		FileReader clientesReader;
		
		
		try {
			clientesReader = new FileReader (clienteFile);
			BufferedReader sBufferReader = new BufferedReader(clientesReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Cliente sCliente = new Cliente();
				sCliente.setId(data[0]); 
				sCliente.setNombre(data[1]);
				sCliente.setApellido(data[2]);
				sCliente.setTelefono(data[3]);
				
				sListClientes.add(sCliente);
				
			}
			if (sBufferReader != null) {
				   try {
					   sBufferReader.close();
					   } 
					   catch (IOException e) {
					    e.printStackTrace();
					   }
					  }
		
					 
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sListClientes;
	}
		
		
		
		
	

	public List<Venta> getListaVentas() {
		//Aqui va la ruta específica del archivo a leer
		File ventasFile = new File("C:\\Users\\giser\\OneDrive\\Escritorio\\TP_Ventas\\venta.txt");
		List<Venta> sListVentas = new ArrayList<Venta>();
		FileReader ventasReader;
		
		
		try {
			ventasReader = new FileReader (ventasFile);
			BufferedReader sBufferReader = new BufferedReader(ventasReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Venta sVenta = new Venta();
				sVenta.setId(data[0]); 
				sVenta.setFecha(data[1]);
				//Cliente sCliente = new Cliente();
			    //sCliente.setId(data[2]);
				//sVenta.setCliente(sCliente);
				sVenta.setCliente(new Cliente(data[2]));
				sVenta.setTotal(data[3]);
				
				sListVentas.add(sVenta);
				
			}
			if (sBufferReader != null) {
				   try {
					   sBufferReader.close();
					   } 
					   catch (IOException e) {
					    e.printStackTrace();
					   }
					  }
		
					 
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sListVentas;
	}

	public List<Detalle> getListaDetalles() {
		//Aqui va la ruta específica del archivo a leer
		File detalleFile = new File("C:\\Users\\giser\\OneDrive\\Escritorio\\TP_Ventas\\detalle.txt");
		List<Detalle> sListDetalle = new ArrayList<Detalle>();
		FileReader detallesReader;
		
		
		try {
			detallesReader = new FileReader (detalleFile);
			BufferedReader sBufferReader = new BufferedReader(detallesReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Detalle sDetalle = new Detalle();
				sDetalle.setId(data[0]); 
				sDetalle.setVenta(new Venta(data[1]));
				sDetalle.setProducto( new Producto(data[2]));
				sDetalle.setCantidad(data[3]);
				sDetalle.setPrecio(data[4]);
				
				sListDetalle.add(sDetalle);
				
			}
			if (sBufferReader != null) {
				   try {
					   sBufferReader.close();
					   } 
					   catch (IOException e) {
					    e.printStackTrace();
					   }
					  }
		
					 
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sListDetalle;
	}
	

	public List<Producto> getListaProductos() {
		File productoFile = new File("C:\\Users\\giser\\OneDrive\\Escritorio\\TP_Ventas\\producto.txt");
		List<Producto> sListProducto = new ArrayList<Producto>();
		FileReader productoReader;
		
		
		try {
			productoReader = new FileReader (productoFile);
			BufferedReader sBufferReader = new BufferedReader(productoReader);
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				String data [] = linea.split(",");
				Producto sProducto = new Producto();
				sProducto.setId(data[0]); 
				sProducto.setNombre(data[1]);
				sProducto.setCantidad(data[2]);
				sProducto.setPrecio(data[3]);
				
				sListProducto.add(sProducto);
				
			}
			if (sBufferReader != null) {
				   try {
					   sBufferReader.close();
					   } 
					   catch (IOException e) {
					    e.printStackTrace();
					   }
					  }
		
					 
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sListProducto;
	}
	
	public List<Informe>getListaInformes(){
		List<Informe>infList = new ArrayList<Informe>();
		
		List<Detalle>sDetalle=new ArrayList<Detalle>();
		List<Venta>sVenta=new ArrayList<Venta>();
		List<Cliente>sCliente=new ArrayList<Cliente>();
		sVenta=getListaVentas();
		sCliente=getListaClientes();
		sDetalle=getListaDetalles();
		
		//Informe inf = new Informe();
		
		for(Cliente clientes:sCliente) {
			for(Detalle detalles:sDetalle) {
				for(Venta ventas: sVenta) {
					if(clientes.getId().equals(ventas.getCliente().getId())&&ventas.getId().equals(detalles.getVenta().getId())){
						Informe inf = new Informe(clientes,detalles,ventas);
						infList.add(inf);
						//Prueba de testeo para la rama TEST
					}
				}
			}
			
		}
				
			
		return infList;
		
	}






	






	






	
		
		
	}
	
	


