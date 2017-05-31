package estilo;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import vista.Vprincipal;


public class Estilo {
    public void cargar_titulo(){
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/sis.png"));
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(Vprincipal.titu.getWidth(), Vprincipal.titu.getHeight(), Image.SCALE_DEFAULT));
        Vprincipal.titu.setIcon(icono);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/img/ad.png"));
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(Vprincipal.ladm.getWidth(), Vprincipal.ladm.getHeight(), Image.SCALE_DEFAULT));
        Vprincipal.ladm.setIcon(icono2);
    }
    
    
    
    public void fonto_boton_finanza(){
         Vprincipal.finanza.setForeground(new java.awt.Color(46,52,67));
         Vprincipal.finanza.setBackground(new java.awt.Color(240, 240, 240));
         
         Vprincipal.registrar.setForeground(new java.awt.Color(240,240,240));
         Vprincipal.registrar.setBackground(new java.awt.Color(46, 52, 67));
    }
    
     public void fonto_boton_registrar(){
         Vprincipal.registrar.setForeground(new java.awt.Color(46, 52, 67));
         Vprincipal.registrar.setBackground(new java.awt.Color(240, 240, 240));
         
         Vprincipal.finanza.setForeground(new java.awt.Color(240, 240, 240));
         Vprincipal.finanza.setBackground(new java.awt.Color(46, 52, 67));
         
       
    }
    
}
