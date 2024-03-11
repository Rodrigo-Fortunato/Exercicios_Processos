package ex01.view;


import ex01.controller.RedesController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       RedesController redes = new RedesController();

       int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione a opção desejada"));

        switch (opc){
            case 1:
                redes.ip();
                break;
            case 2:
                redes.ping();
                break;
            default:
        }



    }
}
