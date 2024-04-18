package register;

public class Gerente extends Empleado{

    // Atributos
    private String departamento;

    // Constructor
    public Gerente(String nombre, int edad, String cargo, double salario, String departamento) {
        super(nombre, edad, cargo, salario);
        this.departamento = departamento;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salario: " + getSalario());
        System.out.println("Departamento: " + getDepartamento());
    }

    // Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
