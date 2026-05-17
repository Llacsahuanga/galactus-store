package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import models.Venta;

public interface VentaMapper {
	
	Venta obtenerVentaPorCodigoInterno(String codigoInterno);
	void insertarVenta(Venta venta);

}