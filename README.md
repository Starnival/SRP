# Sistema de Registro de Empleados

## Summary

Desarrolla un sistema de registro de empleados que permita almacenar información básica sobre los empleados de una empresa. El sistema debe ser capaz de registrar tanto empleados regulares como gerentes.

## Requisitos Funcionales

- El sistema debe permitir registrar nuevos empleados, solicitando su nombre, edad y salario.
- Los empleados pueden ser de dos tipos: regulares y gerentes.
- Para los empleados regulares, el sistema solo debe solicitar su puesto en la empresa.
- Para los gerentes, además de su puesto, el sistema debe solicitar el departamento que supervisan.
- El sistema debe permitir mostrar la información de todos los empleados registrados, incluyendo nombre, edad, salario y cualquier atributo adicional según el tipo de empleado.
- El sistema debe ser capaz de calcular y mostrar el salario total de la empresa, sumando los salarios de todos los empleados.

## Requisitos Técnicos

- Utiliza clases y herencia para modelar los diferentes tipos de empleados.
- Implementa métodos para registrar nuevos empleados, mostrar la información de todos los empleados y calcular el salario total de la empresa.
- Utiliza encapsulamiento para proteger los atributos de las clases y proporciona métodos getters y setters según sea necesario.
- Crea una clase principal con el método main() para probar el sistema, creando instancias de empleados y gerentes y realizando operaciones con ellos.

## Ejemplos de Ejecución
```
Bienvenido al Sistema de Registro de Empleados

1. Registrar nuevo empleado
2. Mostrar información de todos los empleados
3. Calcular salario total de la empresa
4. Salir

Ingrese una opción: 1

Tipo de empleado (1: Regular, 2: Gerente): 1
Nombre del empleado: Juan
Edad del empleado: 30
Salario del empleado: 25000
Puesto del empleado: Desarrollador

Empleado registrado exitosamente.

Ingrese una opción: 2

Información de todos los empleados:
1. Juan, Edad: 30, Salario: $25000, Puesto: Desarrollador

Ingrese una opción: 3

Salario total de la empresa: $25000

Ingrese una opción: 4

¡Gracias por usar el Sistema de Registro de Empleados!

```

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
