import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        File datosClientes = new File("datosClientes.txt");
        if(datosClientes.isFile()){
            try{
                ObjectInputStream lecturaClientes = new ObjectInputStream(new FileInputStream(datosClientes));
                ArrayList<?> clientesDelArchivo = (ArrayList<?>) lecturaClientes.readObject();
                lecturaClientes.close();
                for(Object object:clientesDelArchivo){
                    if(object instanceof Cliente){
                        listaClientes.add((Cliente) object);
                    }
                }
            }catch(Exception e){
             }
        }
        Scanner s = new Scanner(System.in);
        int x;
        boolean z= true;

        while (z){

            System.out.println("1-Crear Cliente");
            System.out.println("2-Listar clientes (todos los datos, excepto los activos)");
            System.out.println("3-Buscar por nombre y listar datos completos de un cliente (incluyendo los activos)");
            System.out.println("4-Buscar y eliminar un cliente.");
            System.out.println("5-Agregar Activos a un cliente");
            System.out.println("6-SALIR");
            switch (x=s.nextInt()){
                case 1: crearCliente(listaClientes);break;
                case 2: listarClientes(listaClientes);break;
                case 3: buscarClientes(listaClientes);break;
                case 4: break;
                case 5: agregarActivos(listaClientes);break;
                case 6: z=false;
                    try {
                        ObjectOutputStream escrituraClientes = new ObjectOutputStream(new FileOutputStream("datosClientes.txt"));
                        escrituraClientes.writeObject(listaClientes);
                        escrituraClientes.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    } break;
            }
        }

    }

    public static void crearCliente(ArrayList<Cliente> lista){
        String Nombre;
        String Apellido;
        int DNI;
        String Direccion;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");
        Nombre = s.nextLine();
        System.out.println("Ingrese el Apellido");
        Apellido = s.nextLine();

        System.out.println("Ingrese el DNI");
        try{
            DNI=s.nextInt();
            s.nextLine();
            System.out.println("Ingrese la Direccion");
            Direccion = s.nextLine();
            lista.add(new Cliente(Nombre,Apellido,DNI,Direccion));
        }catch(InputMismatchException e){
            System.out.println("Ingrese un numero por favor.");
        }
    }
    public static void listarClientes(ArrayList<Cliente> lista){
        for(Cliente cliente : lista){
            cliente.supertoString();
        }
    }
    public static void buscarClientes(ArrayList<Cliente> lista){
        Scanner s = new Scanner(System.in);
        String Nombre;
        System.out.println("Ingrese el Nombre: ");
        Nombre = s.nextLine();
        for(Cliente cliente : lista){
            if (cliente.getNombre().equals(Nombre)) {
                cliente.informe();
            }
            break;
        }
    }
    public static void eliminarCliente(ArrayList<Cliente> lista){
        Scanner s = new Scanner(System.in);
        String Nombre;
        System.out.println("Ingrese el Nombre: ");
        Nombre = s.nextLine();
        for(Cliente cliente : lista){
            if (cliente.getNombre().equals(Nombre)) {
                lista.remove(cliente);
            }
            else{
                System.out.println("no existe el cliente");
            }
            break;
        }
    }
    public static void agregarActivos(ArrayList<Cliente> lista){
        Scanner s = new Scanner(System.in);
        String Nombre;
        System.out.println("Ingrese el Nombre: ");
        Nombre = s.nextLine();
        //s.nextLine();
        for(Cliente cliente : lista){
            if (cliente.getNombre().equals(Nombre)) {
                int x;
                System.out.println("Cuantos activos quiere ingresar?");
                x=s.nextInt();
                for(int i=0;i<x;i++){
                    int monto;
                    String nombre;
                    System.out.println("ingrese el nombre del activo");
                    nombre = s.nextLine();
                    System.out.println("ingrese el monto del activo");
                    monto = s.nextInt();
                    cliente.agregarActivo(nombre,monto);
                }
            }
            else{
                System.out.println("no existe el cliente");
            }
            break;
            }
    }
}
