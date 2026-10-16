/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public class CasaInversionista {
    
    private String clave;
    private String historialConfiabilidad;
    private String nivelRiesgo;
    private double porcentajeRetorno;
    private double montoMinimo;
    private double montoMaximo;
    private int plazoMeses;
    
    private static int totalCasas = 0;
    
    public CasaInversionista(String clave, String historialConfiabilidad, String nivelRiesgo, double porcentajeRetorno, double montoMinimo, double montoMaximo, int plazoMeses) {
        this.clave = clave;
        this.historialConfiabilidad = historialConfiabilidad;
        this.nivelRiesgo = nivelRiesgo;
        this.porcentajeRetorno = porcentajeRetorno;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
        this.plazoMeses = plazoMeses;
        totalCasas++;
    }
    public String getClave() {
        return clave;
    }
    public String getHistorialConfiabilidad() {
        return historialConfiabilidad;
    }
    public String getNivelRiesgo() {
        return nivelRiesgo;
    }
    public double getPorcentajeRetorno() {
    return porcentajeRetorno;
    }
    public double montoMinimo() {
        return montoMinimo;
    }
    public double montoMaximo() {
        return montoMaximo;
    }
    public int getplazoMeses() {
        return plazoMeses;
    }
    public static int getTotalCasas(){
        return totalCasas;
    }
    public boolean permiteInversion(double monto) {
        return monto >= montoMinimo && monto <= montoMaximo;
    }
    public double calcularRetornoEstimado(double monto) {
        if(!permiteInversion(monto)) {
            return 0;
    }
    return monto * (porcentajeRetorno / 100) * (plazoMeses / 12.0);            
    }
    
    @Override
    public String toString() {
        return "Casa inversionista: " + clave + ", Historial: " + historialConfiabilidad + ", Riesgo: " + nivelRiesgo + ", Retorno anual: " + porcentajeRetorno + "%" + ", Monto minimo: $" + montoMinimo + ", Monto maximo: $" + montoMaximo + ", Plazo: " + plazoMeses + " meses";
    }
        
    
}
