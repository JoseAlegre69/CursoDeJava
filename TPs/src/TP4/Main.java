package TP4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String nombre = "Jose";
        int edad = 22;
        double salario = 10000000;
        boolean carnet = true;
        JOptionPane.showMessageDialog(null,
                "Mi nombre es: "+nombre+", tengo " + edad +" " + "años" +", me gustaria ganar " +salario+" centavos."+" Carnet? "+carnet);

    }
}
