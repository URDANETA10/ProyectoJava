package controlador;

import java.awt.event.*;
import javax.swing.*;
import modelo.*;
import vista.*;
import estilo.Estilo;

public class Controlador implements ActionListener {

    Conectar cc = new Conectar();
    Estilo es = new Estilo();
    private final Vprincipal vp;

    public Controlador(Vprincipal vp) {
        this.vp = vp;
        Vprincipal.cerrar.addActionListener(this);
        Vprincipal.registrar.addActionListener(this);
        Vprincipal.finanza.addActionListener(this);

    }

    public void iniciar() {
        vp.setTitle("Menú Principal");
        vp.pack();
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
        cc.conexion();
        es.cargar_titulo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (vp.cerrar == e.getSource()) {
                System.exit(0);
            } else if (vp.finanza == e.getSource()) {
                es.fonto_boton_finanza();
            } else if (vp.registrar == e.getSource()) {
                es.fonto_boton_registrar();
            }
        } catch (Exception ex) {
        }
    }

}
