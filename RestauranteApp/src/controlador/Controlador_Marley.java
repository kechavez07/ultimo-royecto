
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.FabricaPedido;
import modelo.PedidoBebidas;
import vista.FrmBebidas;
import vista.FrmConfirmacion;
import vista.FrmEntradas;
import vista.FrmFuerte;
import vista.FrmMenu;
import vista.FrmPostre;

/**
 *
 * @author Jeimy
 */
public class Controlador_Marley implements ActionListener, KeyListener {
    FrmBebidas objetoVistaBebidas;
    FrmEntradas objetoVistaEntradas;
    FrmFuerte objetoVistaFuerte;
    FrmPostre objetoVistaPostre;
    FrmConfirmacion objetoVistaConfirmacion;
    FrmMenu objetoVistaMenu;
    FabricaPedido pedBeb= new PedidoBebidas();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

}
