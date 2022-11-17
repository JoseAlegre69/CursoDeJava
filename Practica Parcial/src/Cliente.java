import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList <Activo> activos = new ArrayList();

    Cliente(String nombre, String apellido, int dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }

    public void informe() {
        System.out.printf(super.toString());
        System.out.println(activos.toString());
    }
    public void supertoString(){
        System.out.println(super.toString());
    }

    public ArrayList<Activo> getActivos() {
        return activos;
    }

    public void agregarActivo(String nombre, int monto){
        this.activos.add(new Activo(nombre,monto));
    }

}
