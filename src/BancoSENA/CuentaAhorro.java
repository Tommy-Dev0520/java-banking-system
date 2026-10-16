/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public class CuentaAhorro extends CuentaBancaria {

    private double tasaInteresAnual;
    private boolean depositoInicialRealizado;

    private static int totalCuentasAhorro = 0;

    public CuentaAhorro(int numeroCuenta, Cliente titular,
                        double tasaInteresAnual) {
        super(numeroCuenta, titular);
        this.tasaInteresAnual = tasaInteresAnual;
        this.depositoInicialRealizado = false;
        totalCuentasAhorro++;
    }
    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
    public boolean isDepositoInicialRealizado() {
        return depositoInicialRealizado;
    }
    public static int getTotalCuentasAhorro() {
        return totalCuentasAhorro;
    }

    @Override
    public boolean depositar(double monto) {
        if (monto <= 0) {
            return false;
        }
        if (!depositoInicialRealizado) {
            if (monto != 1000) {
                return false;
            }
            depositoInicialRealizado = true;
        }
        saldo += monto;
        return true;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= 0) {
            return false;
        }
        if (saldo - monto < 500) {
            return false;
        }
        saldo -= monto;
        return true;
    }
    public void calcularInteresMensual() {
        double interesMensual = saldo * (tasaInteresAnual / 100) / 12;
        saldo += interesMensual;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tasa anual: " + tasaInteresAnual + "%";
    }
}
