package main;

import controlador.Controlador;
import vista.Vprincipal;

public class Ejecutar {

    public static void main(String[] args) {
        Vprincipal vp = new Vprincipal();

        Controlador c = new Controlador(vp);
        c.iniciar();

    }

}
