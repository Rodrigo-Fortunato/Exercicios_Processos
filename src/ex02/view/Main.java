package ex02.view;

import ex02.controller.KillController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        KillController kill = new KillController();
        String[] opcoes = {"Listar Processos", "Matar por Pid", "Matar por Nome", "Cancelar"};
        int opc = 0;

        while (opc != -1) {
            opc = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções de Processos",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
            try {


                switch (opc) {
                    case 0:
                        System.out.println("Usuário escolheu Listar Processos");
                        kill.listaProcessos();
                        break;
                    case 1:
                        System.out.println("Usuário escolheu Matar por Pid");
                        int pid = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o PID do processo: "));
                        kill.mataPid(pid);
                        break;
                    case 2:
                        System.out.println("Usuário escolheu Matar por Nome");
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome do processo: ");
                        kill.mataNome(nome);
                        break;
                    default:
                        System.out.println("Usuário escolheu Cancelar");
                        opc = -1;
                        break;
                }
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}
