package register;

public class Regular extends Empleado {

    // Atributos

    // Constructor
    public Regular(String nombre, int edad, String cargo, double salario) {
        super(nombre, edad, cargo, salario);
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salario: " + getSalario());
    }
}
