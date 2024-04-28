package ar.com.unpaz.service;
import java.util.*;

import ar.com.unpaz.crud.*;
import ar.com.unpaz.model.*;

import ar.com.unpaz.repository.LeerArchivosRepositorio;

public class LeerArchivosServicio implements Functions{
	public List<Cliente> getListaClientes(){
		LeerArchivosRepositorio repo = new LeerArchivosRepositorio();
		List<Cliente> sList = new ArrayList<Cliente>();
		sList = repo.getListaClientes();
		return sList;
	}
	public List<Venta> getListaVentas(){
		LeerArchivosRepositorio repo = new LeerArchivosRepositorio();
		List<Venta> sListV = new ArrayList<Venta>();
		sListV = repo.getListaVentas();
		return sListV;
	}
	public List<Detalle> getListaDetalles(){
		LeerArchivosRepositorio repo = new LeerArchivosRepositorio();
		List<Detalle> sListD = new ArrayList<Detalle>();
		sListD = repo.getListaDetalles();
		return sListD;
	}
	public List<Producto> getListaProductos(){
		LeerArchivosRepositorio repo = new LeerArchivosRepositorio();
		List<Producto> sListP = new ArrayList<Producto>();
		sListP = repo.getListaProductos();
		return sListP;
	}
	public List<Informe> getListaInformes() {
		LeerArchivosRepositorio repo = new LeerArchivosRepositorio();
		List<Informe>sInf = new ArrayList<Informe>();
		sInf=repo.getListaInformes();
		return sInf;
	}
	
	
	
	
}