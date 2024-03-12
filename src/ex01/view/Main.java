package ex01.view;


import ex01.controller.RedesController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RedesController redes = new RedesController();


        // Opções dos botões
        String[] opcoes = {"IP", "Ping", "Cancelar"};

        // Exibindo o JOptionPane
        int opc = JOptionPane.showOptionDialog(null,"Escolha uma opção:", "Opções de Rede",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, opcoes, opcoes[2]); // Botão padrão

        switch (opc) {
            case 0:
                System.out.println("Usuário escolheu IP");
                redes.ip();
                break;
            case 1:
                System.out.println("Usuário escolheu Ping");
                redes.ping();
                break;
            default:
                System.out.println("Usuário escolheu Cancelar");
        }


    }
}
