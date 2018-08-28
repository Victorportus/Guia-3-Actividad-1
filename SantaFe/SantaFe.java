import java.util.Scanner;
import java.util.*;

public class SantaFe
{
    static Scanner teclado = new Scanner(System.in);
    static int dato = 9;
    static ArrayList<Empleado> a = new ArrayList<Empleado>();
    
    static String Nombre;
    static String Apellido;
    static String Departamento;
    static String Posicion;
    static int Salario;
    public static void lista(){
        Nombre = "Doris";
        Apellido = "Romero";
        Departamento = "Presidencia";
        Posicion = "CEO";
        Salario = 20000000;
        a.add(new Empleado(Nombre, Apellido, Departamento, Posicion, Salario));
        
        Empleado francisco = new Empleado();
        francisco.setNombre("Francisco");
        francisco.setApellido("Bermudez");
        francisco.setDepartamento("Contabilidad");
        francisco.setPosicion("Contador");
        francisco.setSalario(14000000);
        a.add(francisco);
        
        Empleado maria = new Empleado();
        maria.setNombre("Maria");
        maria.setApellido("Bejarano");
        maria.setDepartamento("Operaciones");
        maria.setPosicion("Gerente de bodega");
        maria.setSalario(10000000);
        a.add(maria);
        
        Empleado francisca = new Empleado();
        francisca.setNombre("Francisca");
        francisca.setApellido("Zambrano");
        francisca.setDepartamento("Operaciones");
        francisca.setPosicion("Supervisor de calidad");
        francisca.setSalario(8000000);
        a.add(francisca);
        
        Empleado carlos = new Empleado();
        carlos.setNombre("Carlos");
        carlos.setApellido("Pinzon");
        carlos.setDepartamento("Servicio al cliente");
        carlos.setPosicion("Jefe de servicio al cliente");
        carlos.setSalario(7500000);
        a.add(carlos);
    }
    
    public static void  main(String[] args){
        lista();
        System.out.println(".::SUPERMERCADO SANTA FE::.");
        System.out.println("");
        System.out.println("");
        
        do {
            System.out.println("Presione 1 para ver la informacion de todos los empleados");
            System.out.println("Presione 2 para buscar un empleado por su nombre");
            System.out.println("Presione 3 para crear un nuevo empleado");
            System.out.println("Presione 0 para salir del programa");
            int dato = teclado.nextInt();        
            System.out.println("");
            switch (dato){
                case 1:
                for (int i = 0; i < a.size() ; i++){
                    System.out.println(a.get(i).getNombre() +" "+ a.get(i).getApellido() +"    "+ a.get(i).getDepartamento() +"  "+ a.get(i).getPosicion() +"  "+ a.get(i).getSalario());  
                }   
                System.out.println("");  
                break;
                
                case 2:
                System.out.println("Ingrese solo el nombre del empleado que esta buscando, sin apellido");
                String nom = teclado.next();          
                for (int i = 0; i < a.size() ; i++){
                    if (a.get(i).getNombre().equals(nom)){
                        System.out.println("");
                        System.out.println(a.get(i).getNombre() +" "+ a.get(i).getApellido() +"    "+ a.get(i).getDepartamento() +"  "+ a.get(i).getPosicion() +"  "+ a.get(i).getSalario()); 
                        System.out.println("");
                    }
                }
                System.out.println("");
                break;
                
                case 3:
                System.out.println("");
                System.out.println("Ingrese solo el nombre del nuevo empleado, sin apellido");
                Nombre = teclado.next();
                System.out.println("Ingrese el Apellido del nuevo empleado");
                Apellido = teclado.next();
                System.out.println("A que departamento corresponde el nuevo empleado?");
                Departamento = teclado.next();
                System.out.println("Que cargo teine el nuevo empleado");
                Posicion = teclado.next();
                System.out.println("Cual es el salario del nuevo empleado");
                Salario = teclado.nextInt();
                a.add(new Empleado(Nombre, Apellido, Departamento, Posicion, Salario));
                System.out.println("");
                for (int i = 0; i < a.size() ; i++){
                    System.out.println(a.get(i).getNombre() +" "+ a.get(i).getApellido() +"    "+ a.get(i).getDepartamento() +"  "+ a.get(i).getPosicion() +"  "+ a.get(i).getSalario());                
                } 
                System.out.println(""); 
                break;
                
                case 0:
                System.exit(0);
            }
        } while (dato != 0);

    }
} 
    



