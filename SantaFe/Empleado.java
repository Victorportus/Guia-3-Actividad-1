

public class Empleado
{
    private String Nombre;
    private String Apellido;
    private String Departamento;
    private String Posicion;
    private int Salario;
    
    public Empleado(){
        Nombre = "";
        Apellido = "";
        Departamento= "";
        Posicion= "";
        Salario = 0;        
    }
    public Empleado(String n, String a, String d, String p, int s){
        Nombre = n;
        Apellido = a;
        Departamento= d;
        Posicion= p;
        Salario = s;        
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setDepartamento(String Departamento){
        this.Departamento = Departamento;
    }
    public String getDepartamento(){
        return Departamento;
    }
    public void setPosicion(String Posicion){
        this.Posicion = Posicion;
    }
    public String getPosicion(){
        return Posicion;
    }
    public void setSalario(int Salario){
        this.Salario = Salario;
    }
    public int getSalario(){
        return Salario;
    }
}
