package register;

import java.util.Scanner;

import globalUtils.GlobalUtils;

public class Registro {
    
    public static Scanner scanner = new Scanner(System.in);
    

    public static Empleado RegistrarRegular() {
        try {
            System.out.println("Nombre del empleado: ");
            String nombre = scanner.next();
            nombre = GlobalUtils.capitalize(nombre);

            System.out.println("Edad del empleado: ");
            int edad = scanner.nextInt();

            System.out.println("Salario del empleado: ");
            double salario = scanner.nextDouble();

            Regular regular = new Regular(nombre, edad, "Regular", salario);
            
            System.out.println("Empleado registrado exitosamente");
            System.out.println("================================");
            regular.mostrarInfo();

            return regular;

        } catch (Exception e) {
            System.out.println("Error al registrar el regular");
            return null;
        }
    }

    public static Empleado RegistrarGerente() {
        try {
            System.out.println("Nombre del empleado: ");
            String nombre = scanner.next();

            System.out.println("Edad del empleado: ");
            int edad = scanner.nextInt();

            System.out.println("Salario del empleado: ");
            double salario = scanner.nextDouble();

            System.out.println("Departamento que supervisa: ");
            String departamento = scanner.next();

            Gerente gerente = new Gerente(nombre, edad, "Gerente", salario, departamento);

            System.out.println("Empleado registrado exitosamente");
            System.out.println("================================");
            gerente.mostrarInfo();

            return gerente;

        } catch (Exception e) {
            System.out.println("Error al registrar el gerente");
            return null;
        }
    }


    


    
}
