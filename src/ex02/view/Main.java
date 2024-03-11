package ex02.view;

import ex02.controller.KillController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        KillController kill = new KillController();
        kill.listaProcessos();
        //int pid = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um PID"));
        //kill.mataPid(pid);

        String nomeProcesso = JOptionPane.showInputDialog(null,"Digite o nome do processo");
        kill.mataNome(nomeProcesso);
    }
}
