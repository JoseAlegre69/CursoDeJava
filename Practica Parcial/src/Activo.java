import java.io.Serializable;

public class Activo implements Informe, Serializable {
    private String Nombre;
    private int Monto;

    @Override
    public String toString() {
        return "Activo{" +
                "Nombre='" + Nombre + '\'' +
                ", Monto=" + Monto +
                '}';
    }
    Activo(String nombre, int monto){
        this.Nombre = nombre;
        this.Monto = monto;
    }

    @Override
    public void informe() {
        System.out.println(this);
    }
}
