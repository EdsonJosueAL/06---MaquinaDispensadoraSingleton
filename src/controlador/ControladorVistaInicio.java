package controlador;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import modelo.ModeloChoco;
import modelo.ModeloCompra;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
import vista.VistaInicio;
import vista.VistaOperaciones;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class ControladorVistaInicio implements WindowListener,Runnable{
		VistaInicio vistaInicio = new VistaInicio();
		
	/**
	 * Constructor de la clase 	
	 * @param vistaInicio clase Vista de Inicio
	 * @param mDulces Clase modelo de Dulces
	 * @param mChoco Clase modelo de Chocolate
	 * @param mGalleta Clase modelo de Galleta
	 * @param mRefre Clase modelo de Refresco
	 */
	public ControladorVistaInicio(VistaInicio vistaInicio) {
			super();
			this.vistaInicio = vistaInicio;	
			vistaInicio.onLoadVentana(this);
		}
	/**
	 * Mètodo que se ejucatará al abrir la ventana
	 */	
	@Override
	public void windowOpened(WindowEvent e) {		
		new Thread(new ControladorVistaInicio(vistaInicio)).start();
	}
	/**
	 * Mètodo que se ejucatará al cerrar el JFrame
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Mètodo que se ejucatará al abrir el JFrame
	 */
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Mètodo que se ejucatará al abrir el JFrame
	 */
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Mètodo que se ejucatará cuando se ponga el foco en la ventana
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Mètodo que se ejucatará cuando se quite el foco en la ventana	
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}
	/**
	 * Mètodo que se ejucatará cuando se quite el foco en la ventana	
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Mètodo que se ejecuta al hilo
	 */
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			vistaInicio.getPbInicio().setValue(i);
			vistaInicio.getPbInicio().repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {
					JOptionPane.showInternalMessageDialog(vistaInicio, "Algo mal :/", "Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		VistaOperaciones vOperaciones = new VistaOperaciones();
		ControladorOperaciones cOperaciones = new ControladorOperaciones(vOperaciones);
		vOperaciones.setVisible(true);

	}

}
