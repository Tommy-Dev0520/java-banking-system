/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public class Empleado extends PersonaNatural {
    private String puesto;
    private double salario;
    private int añosTrabajados;
    
    private static int totalEmpleados = 0;
    
    public Empleado(int numero, String nombre, String puesto, double salario, int añosTrabajados) {
        super(numero, nombre);
        this.puesto = puesto;
        this.salario = salario;
        this.añosTrabajados = Math.max(0, añosTrabajados);
        totalEmpleados++;
    }
    public String getPuesto() {
       return puesto;
    }
    public double getSalario() {
        return salario;
    }
    public int getAñosTrabajados() {
        return añosTrabajados;
    }
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    public int calcularDiasVacaciones() {
        if(añosTrabajados == 0) {
            return 0;
        }
        int dias = 5 + (añosTrabajados - 1) * 2;
        return Math.min(dias, 20);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Puesto: " + puesto + ", Salario: " + salario + ", Antiguedad: " + añosTrabajados + " años" + ", Vacaciones: " + calcularDiasVacaciones() + " dias";
    }
}
