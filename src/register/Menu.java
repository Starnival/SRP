package register;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static void mostrarMenu() {
        // Variables
        Scanner sc = new Scanner(System.in);
        int op = 0;
        

        // Menu de inicio
        System.out.println("Bienvenido al Sistema de Registro de Empleados");
        System.out.println("1. Registrar nuevo empleado");
        System.out.println("2. Mostrar información de todos los empleados");
        System.out.println("3. Calcular salario total de la empresa");
        System.out.println("4. Salir");

        while (op != 4) {
            System.out.println("Ingrese una opción: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. Registrar Regular | 2. Registrar Gerente");
                    int op2 = sc.nextInt();
                    if (op2 == 1) {
                        Empleado.AddEmpleados(Registro.RegistrarRegular());
                    } else if (op2 == 2) {
                        Empleado.AddEmpleados(Registro.RegistrarGerente());
                    }
                    break;
                case 2:
                    System.out.println("Información de todos los empleados");

                    // Obtener la lista de empleados
                    ArrayList<Empleado> empleadoList = Empleado.GetListaEmpleados(); 

                    // Mostrar la información de todos los empleados
                    for (Empleado empleado : empleadoList) {
                        if (empleado instanceof Regular) {
                            Regular regularEmpleado = (Regular) empleado;
                            regularEmpleado.mostrarInfo();
                        }else{
                            Gerente gerenteEmpleado = (Gerente) empleado;
                            gerenteEmpleado.mostrarInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Salario total de la empresa: " + Empleado.CalcularSalarioTotal(Empleado.GetListaEmpleados()));
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no encontrada");
            }
        }

        // Cerrar el Scanner
        sc.close();
    }
}
