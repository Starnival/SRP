package register;

import java.util.ArrayList;

public class Empleado {

    // Atributos
    private int id;
    private String nombre;
    private int edad;
    private String cargo;
    private double salario;

    static int idCont = 0;

    public static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    // Constructor
    public Empleado(String nombre, int edad, String cargo, double salario) {
        this.id = ++idCont;
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos
    //Método para calcular la suma total de todos los salarios en la empresa. Pueden ser de Gerentes y de Empleados
    
       
    public static double CalcularSalarioTotal(ArrayList<Empleado> listaEmpleados) {
        double totalSalario = 0;

        for (Empleado empleado : listaEmpleados) {
            totalSalario += empleado.getSalario();
        }

        return totalSalario;
    }

    public static ArrayList<Empleado> AddEmpleados(Empleado empleado) {
        if (empleado != null) {
            listaEmpleados.add(empleado);
            return listaEmpleados;
        }

        return listaEmpleados;
    }

    public static ArrayList<Empleado> GetListaEmpleados() {
        return listaEmpleados;
    }

    // Getters y setters
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
}
