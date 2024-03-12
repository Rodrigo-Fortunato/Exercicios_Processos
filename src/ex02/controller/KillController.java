package ex02.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
    public KillController() {
        super();
    }

    private String os() {
        return System.getProperty("os.name");
    }

    public void listaProcessos() {
        try {//windows
            if (os().contains("Windows")) {
                Process p = Runtime.getRuntime().exec("TASKLIST /FO TABLE");
                InputStream fluxo = p.getInputStream();
                InputStreamReader leitor = new InputStreamReader(fluxo);
                BufferedReader buffer = new BufferedReader(leitor);

                String processos = buffer.readLine();
                while (processos != null) {
                    System.out.println(processos);
                    processos = buffer.readLine();
                }
                buffer.close();
                leitor.close();
                fluxo.close();

            } else {
                Process p = Runtime.getRuntime().exec("ps -ef");
                InputStream fluxo = p.getInputStream();
                InputStreamReader leitor = new InputStreamReader(fluxo);
                BufferedReader buffer = new BufferedReader(leitor);

                String processos = buffer.readLine();
                while (processos != null) {
                    System.out.println(processos);
                    processos = buffer.readLine();
                }
                buffer.close();
                leitor.close();
                fluxo.close();

            }

        } catch (Exception e) {
            System.out.println("Sistema operacional invalido");
        }

    }

    public void mataPid(int pid) {
        try {//windows
            if (os().contains("Windows")) {
                Runtime.getRuntime().exec("TASKKILL /PID " + pid);
            }else {
                Runtime.getRuntime().exec("kill -9 " + pid);
            }
        } catch (Exception e) {
            System.out.println("PID do processo ou Sistema operacional invalido");
        }

    }

    public void mataNome(String nomePro){
        try {//windows
            if (os().contains("Windows")) {
                Runtime.getRuntime().exec("TASKKILL /IM " + nomePro);
            }else {
                Runtime.getRuntime().exec("pkill -f " + nomePro);
            }
        } catch (Exception e) {
            System.out.println("Nome do processo ou Sistema operacional invalido");
        }

    }


}
