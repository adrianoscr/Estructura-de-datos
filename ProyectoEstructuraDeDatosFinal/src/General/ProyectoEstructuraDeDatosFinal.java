package General;

import Logica.Carrito.*;
import Pantallas.FRM_Entrada;

public class ProyectoEstructuraDeDatosFinal {

    public static void main(String[] args) {

        pilaReservacion reservacionesUsuario = new pilaReservacion();
        
        reservacionesUsuario.push(new nodoReservacion(new Reservacion(1, 1, "Cristopher", 2, "22/11/2021 10:30am", 1500.00f, 3000.00f, 3390.00f)));
        reservacionesUsuario.push(new nodoReservacion(new Reservacion(1, 2, "Cristopher", 2, "22/11/2021 10:30am", 1500.00f, 3000.00f, 3390.00f)));
        reservacionesUsuario.push(new nodoReservacion(new Reservacion(1, 3, "Cristopher", 2, "22/11/2021 10:30am", 1500.00f, 3000.00f, 3390.00f)));
        reservacionesUsuario.push(new nodoReservacion(new Reservacion(1, 4, "Cristopher", 2, "22/11/2021 10:30am", 1500.00f, 3000.00f, 3390.00f)));
        

        FRM_Entrada frm_Entrada = new FRM_Entrada();
        frm_Entrada.setVisible(true);
        frm_Entrada.toFront();
    
    }

}
