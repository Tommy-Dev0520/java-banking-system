/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public abstract class CuentaBancaria {
    private static int totalCuentas = 0;
    
    protected int numeroCuenta;
    protected double saldo;
    protected Cliente titular;
    
    public CuentaBancaria(int numeroCuenta, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
        totalCuentas++;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public static int getTotalCuentas() {
        return totalCuentas;
    }
    public boolean depositar(int numeroUsuario, double monto) {
            if(titular.getNumero()!= numeroUsuario) {
                return false;
            }
            return depositar(monto);
        }
        public boolean retirar(int numeroUsuario, boolean identificacionVerificada, double monto){
            if(titular.getNumero()!= numeroUsuario || !identificacionVerificada) {
                return false;
            }
            return retirar(monto);
        }
        
               
    public abstract boolean depositar(double monto);
    
    public abstract boolean retirar(double monto);
    
    @Override
    
    public String toString() {
        return "Cuenta: " + numeroCuenta
                + ", Titular: " + titular.getNombre()
                +", Saldo: $" + saldo;
    }
}
