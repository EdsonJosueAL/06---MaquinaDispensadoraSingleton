package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModeloChoco;
import modelo.ModeloCompra;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
import vista.VistaComprar;
import vista.VistaDetalleChocolate;
import vista.VistaDetalleDulces;
import vista.VistaDetalleGalletas;
import vista.VistaDetalleRefresco;
import vista.VistaOperaciones;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class ControladorOperaciones implements ActionListener{
	VistaOperaciones vOperaciones = new VistaOperaciones();

	
	VistaDetalleDulces vDulces = new VistaDetalleDulces();
	VistaDetalleChocolate vChoco = new VistaDetalleChocolate();
	VistaDetalleGalletas vGalleta = new VistaDetalleGalletas();
	VistaDetalleRefresco vRefresco = new VistaDetalleRefresco();
	VistaComprar vCompra = new VistaComprar();
	

	/**
	 * Constructor de la clase 
	 * @param vOperaciones Clase vista de Operaciones
	 * @param mDulces Clase modelo de Dulces
	 * @param mChoco Clase modelo de Chocolate
	 * @param mGalleta Clase modelo de Galleta
	 * @param mRefre Clase modelo de Refresco
	 */
	public ControladorOperaciones(VistaOperaciones vOperaciones) {
		this.vOperaciones = vOperaciones;
		
			vOperaciones.onClickDulces(this);
			vOperaciones.onClickChoco(this);
			vOperaciones.onClickGalleta(this);
			vOperaciones.onClickRefresco(this);
	}

	/**
	 * MËtodo que se ejucatar· al hacer click sobre un bot√≥n del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Action");
		if(e.getSource() == vOperaciones.getBtnDulces()){
			VistaDetalleDulces vDulces = new VistaDetalleDulces();
			ControladorDetalleDulces cDulces = new ControladorDetalleDulces(vOperaciones,vDulces); 
			vDulces.setVisible(true);
		}else if(e.getSource() == vOperaciones.getBtnChoco()){
			VistaDetalleChocolate vChoco = new VistaDetalleChocolate();
			ControladorDetalleChoco cChoco = new ControladorDetalleChoco(vOperaciones,vChoco);
			vChoco.setVisible(true);
		}else if(e.getSource() == vOperaciones.getBtnGalletas()){
			VistaDetalleGalletas vGalleta = new VistaDetalleGalletas();
			ControladorDetalleGalleta cGalleta = new ControladorDetalleGalleta(vOperaciones,vGalleta);
			vGalleta.setVisible(true);
		}else if(e.getSource() == vOperaciones.getBtnRefresco()){
			VistaDetalleRefresco vRefresco = new VistaDetalleRefresco();
			ControladorDetalleRefresco cRefre = new ControladorDetalleRefresco(vOperaciones,vRefresco); 
			vRefresco.setVisible(true);

		}
		
	}

}
