/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public class CuentaInversion extends CuentaBancaria {

    private static final double MONTO_INICIAL = 25000;
    private static final double SALDO_MINIMO = 10000;

    private boolean cancelada;
    
    private static int totalCuentasInversion = 0;

    public CuentaInversion(int numeroCuenta, Cliente titular) {
        super(numeroCuenta, titular);
        this.cancelada = false;
        totalCuentasInversion++;
    }
    public boolean isCancelada() {
        return cancelada;
    }
    public static int getTotalCuentasInversion() {
        return totalCuentasInversion;
    }

    @Override
    public boolean depositar(double monto) {
        if (cancelada || monto <= 0) {
            return false;
        }
        if (saldo == 0 && monto != MONTO_INICIAL) {
            return false;
        }
        saldo += monto;
        return true;
    }

    @Override
    public boolean retirar(double monto) {
        if (cancelada || monto <= 0 || monto > saldo) {
            return false;
        }
        if (saldo - monto < SALDO_MINIMO) {
            return false;
        }
        saldo -= monto;
        return true;
    }
    public double cancelarCuenta() {
        if (cancelada) {
            return 0;
        }
        double dineroDevuelto = saldo;
        saldo = 0;
        cancelada = true;
        return dineroDevuelto;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + ", Tipo: Inversion"
                + ", Cancelada: " + cancelada;
    }
}