package TP5;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        float a = (float)6/5;
        float b = (float)2/3;
        float c = (float)7/2;
        float d = (float)2/30;
        float e = (float)1/3;

        double result=(a-(b*c)+d/(e/5));
        System.out.println(result);
       JOptionPane.showMessageDialog(null,result);
    }
}
