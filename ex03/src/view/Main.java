package view;

import controller.DistroController;

public class Main {
    public static void main(String[] args) {
        DistroController distribuicao = new DistroController();

        distribuicao.exibeDistro();
    }
}
