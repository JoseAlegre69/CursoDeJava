package TP10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double numAleatorio =(Math.random()*100);
        int numeroGenerado = (int) numAleatorio, numeroUsuario, contador;
        System.out.println("Ingrese un numero");
        numeroUsuario = s.nextInt();
        contador = 1;
        //System.out.println(numeroGenerado);
        while (numeroUsuario != numeroGenerado){
            if (numeroUsuario < numeroGenerado){
                System.out.println("el numero correcto es mayor que el ingresado");
            }else if (numeroUsuario > numeroGenerado){
                System.out.println("el numero correcto es menor que el ingresado");
            }
            contador +=1;
            System.out.println("Ingrese un numero");
            numeroUsuario = s.nextInt();
        }
        System.out.println("Correcto!");
        System.out.println("Los has hecho en "+contador+" intentos");
    }
}
