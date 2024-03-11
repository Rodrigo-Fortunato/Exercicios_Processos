package ex01.controller;

public class RedesController {

    public RedesController(){
        super();
    }

    private String os(){

        return System.getProperty("os.name");
    }
    public void ip(){
        String os = os();


        //System.out.println(os());
    }

    public void ping(){

    }

}
