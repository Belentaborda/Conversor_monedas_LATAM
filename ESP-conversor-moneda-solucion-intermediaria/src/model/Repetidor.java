package model;

import javax.swing.*;

public class Repetidor {

    public boolean intentaRepetir(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra operación?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "Usted finalizo el programa, regrese cada vez que lo necesite.");
                return false;
        }
        return true;
    }
}

