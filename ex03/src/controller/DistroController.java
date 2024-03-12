package controller;

public class DistroController {

    public DistroController() {
        super();
    }

    private String os() {
        return System.getProperty("os.name");
    }

    public void exibeDistro() {
        try {
            if (os().contains("Linux")) {
                Runtime.getRuntime().exec("cat /etc/os-release");

            } else {
                System.out.println("Sistema operacional Windows não suportado");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
