package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***************1**********************");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("***************2**********************");
		
		Cliente cliente = context.getBean("cliente", Cliente.class);

		Producto producto = context.getBean("beanProducto", Producto.class);

		
		Factura factura = context.getBean("factura", Factura.class);
		
		FacturaDetalle facturadetalle = context.getBean("facturaDetalle", FacturaDetalle.class);	
		
		DatosEmpresa datosEmpresa = context.getBean("datosEmpresa", DatosEmpresa.class);
		//CLIENTES
		
		cliente.setIdCliente(1);
		cliente.setCedula("1754442620");
		cliente.setNombre("Juan");
		cliente.setApellido("Sanchez");
		cliente.setEdad(21);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Quito");
		cliente.setTelefono("098129301");
		cliente.setCorreo("juan@productos.com");
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(19.20);
		factura.setIva(0.12);
		factura.setTotal(20.25);
		
		producto.setIdProducto(1);
		producto.setNombre("Uvas");
		producto.setDescripcion("Caja de uvas");
		producto.setPrecio(6.99);
		producto.setStock(100);
		
		facturadetalle.setIdFacturaDetalle(1);
		facturadetalle.setCantidad(5);
		facturadetalle.setFactura(factura);

		System.out.println(factura.toString());
		System.out.println(facturadetalle.toString());;
		System.out.println(datosEmpresa.toString());
				
		System.out.println("***************3**********************");
		context.close();
		System.out.println("***************4**********************");
	}

}