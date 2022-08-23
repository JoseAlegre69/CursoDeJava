package TP6;

public class Main {
    public static void main(String[] args){
        double a = Math.sin(Math.toDegrees(0));
        double b = Math.cos(Math.toDegrees(0));
        double c = Math.tan(Math.toDegrees(Math.PI));
        double d = Math.atan(Math.toDegrees(0));
        double e = Math.atan2(Math.toDegrees(0),Math.PI);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(Math.toDegrees((Math.PI)/2));

        System.out.println(Math.exp(Math.E));
        System.out.println(Math.log(0));

        System.out.println(Math.PI);
        System.out.println(Math.E);

    }
}
