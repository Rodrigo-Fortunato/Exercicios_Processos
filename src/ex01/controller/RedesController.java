package ex01.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

    public RedesController(){
        super();
    }

    private String os(){

        return System.getProperty("os.name");
    }
    public void ip(){
        String os = os();
        String Adaptador ="";


        try {
            //Windows
            if (os.contains("Windows")){
                //Recebe o retorno do tipo "Process" gerado pelo programa executado
                Process p =Runtime.getRuntime().exec("ipconfig");
                InputStream fluxo = p.getInputStream();
                //Converte para String o fluxo de bits
                InputStreamReader leitor = new InputStreamReader(fluxo);
                //Guardando em um buffer a String convertida anteriormente
                BufferedReader buffer = new BufferedReader(leitor);
                //Leitura do buffer, enquanto grava em uma variavel e vai pra proxima linha
                String linha = buffer.readLine();

                //Mantem a leitura do buffer, até que ele chegue ao final
                while (linha != null) {
                    /*A leitura do processo chamado deve verificar cada linha e, imprimir, apenas, o nome do
                        adaptador de rede e o IPv4, portanto, adaptadores sem IPv4 não devem ser mostrados*/


                    if (linha.contains("Adaptador")){
                        Adaptador = linha;
                    }
                    if (linha.contains("IPv4")){
                        System.out.println(Adaptador + " "+ linha);
                    }
//                    System.out.println(linha);
                    linha = buffer.readLine();
                }
                buffer.close();
                leitor.close();
                fluxo.close();

            }else{//Linux
                //Recebe o retorno do tipo "Process" gerado pelo programa executado
                Process p =Runtime.getRuntime().exec("ifconfig");
                InputStream fluxo = p.getInputStream();
                //Converte para String o fluxo de bits
                InputStreamReader leitor = new InputStreamReader(fluxo);
                //Guardando em um buffer a String convertida anteriormente
                BufferedReader buffer = new BufferedReader(leitor);
                //Leitura do buffer, enquanto grava em uma variavel e vai pra proxima linha
                String linha = buffer.readLine();

                //Mantem a leitura do buffer, até que ele chegue ao final
                while (linha != null) {
                    System.out.println(linha);
                    linha = buffer.readLine();
                }
                buffer.close();
                leitor.close();
                fluxo.close();
            }
        }catch (Exception e){
            System.out.println("Sistema Operacional invalido!");
        }


        //System.out.println(os());
    }

    public void ping(){


    }

}
