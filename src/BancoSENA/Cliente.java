/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
 
public class Cliente extends PersonaNatural {

    private int cantidadCuentas;

    // Variable de clase: cuenta cuántos clientes se han creado
    private static int totalClientes = 0;

    public Cliente(int numero, String nombre) {
        super(numero, nombre);
        this.cantidadCuentas = 0;
        totalClientes++;
        
    }
    public int getCantidadCuentas() {
        return cantidadCuentas;
    }
    public void agregarCuenta() {
        cantidadCuentas++;
    }
    public static int getTotalClientes() {
        return totalClientes;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString()
                + ", Cantidad de cuentas: " + cantidadCuentas;
    }
}