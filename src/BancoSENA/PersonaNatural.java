/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public class PersonaNatural {
    
    private int numero;
    private String nombre;
    
    private static int totalPersonas = 0;
    
    public PersonaNatural(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public int getNumero() {
        return numero;
    }
    public String getNombre() {
        return nombre;
    }
    public static int getTotalPersonas() {
        return totalPersonas;
    }
    
    @Override
    public String toString() {
        return "Numero: " + numero + ", Nombre: " + nombre;
    }
}
