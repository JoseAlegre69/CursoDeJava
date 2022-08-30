package TP9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int altura;
        int gen, pesoideal;
        pesoideal =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su altura, en cm");
        altura = s.nextInt();
        System.out.println("Ingrese su genero. 1 para hombre, 2 para mujer");
        gen = s.nextInt();
        if (gen==2){
            pesoideal = altura - 120;
        }else{
            if (gen==1){
                pesoideal = altura - 110;
            }else System.out.println("Genero invalido");
        }
        System.out.println("su peso ideal es "+ pesoideal +" kg");

    }
}
