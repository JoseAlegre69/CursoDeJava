package TP8;
import java.util.Scanner;
public class RaizScanner {
    private double num;
    Scanner s = new Scanner(System.in);
    public double operate(){
        System.out.println("ingrese el numero q desea operar");
        this.num = s.nextDouble();
        if (num <0){
            System.out.println("error ingrese un numero positivo");
        }else if (num ==0){
            return 0;
        }else {return (Math.sqrt(num));}
        return 0;
    }
}
