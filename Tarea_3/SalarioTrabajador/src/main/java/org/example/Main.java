package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        Trabajador trabajador = new Trabajador(nombre, horasTrabajadas, tarifa);

        double sueldo = trabajador.getSueldo();
        System.out.println("Salario total para " + nombre + ": " + sueldo);
    }
}