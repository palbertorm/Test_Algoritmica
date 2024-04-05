package org.example;

public class Trabajador {
    private String nombre;
    private int horasTrabajadas;
    private double tarifa;

    public Trabajador(String nombre, int horasTrabajadas, double tarifa) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifa;
    }
    public double calcularSueld(){
        double sueldo;
        if (horasTrabajadas <=40 ){
            sueldo = horasTrabajadas * tarifa;
        }else {
            int hoorasExtras = horasTrabajadas -40;
            double tarifaExtra= tarifa * 1.5;
            sueldo = (40 * tarifa) + (hoorasExtras * tarifaExtra);
        }
        return sueldo;
    }
    public double getSueldo(){
        return calcularSueld();
    }
}
