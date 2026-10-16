/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoSENA;

/**
 *
 * @author Asus
 */
public class AplicacionBanco {
    public static void main(String [] args) {
        System.out.println("===== SISTEMA DE BANCO DEL SENA =====");
        
        Cliente cliente = new Cliente(101, "Tommy");
        
        CuentaAhorro ahorro = new CuentaAhorro(1001, cliente, 12);
        CuentaInversion inversion = new CuentaInversion(2001, cliente);
        
        System.out.println("--- VALIDACION DEL USUARIO ---");
        System.out.println("Numero del titular: " + cliente.getNumero());
        System.out.println("Deposito inicial autorizado: " + ahorro.depositar(101, 1000));
        System.out.println("Deposito adicional autorizado: " + ahorro.depositar(101, 500));
        System.out.println("Deposito con numero incorrecto: " + ahorro.depositar(999, 500));
        System.out.println("Retiro sin verificar identidad: " + ahorro.retirar(101, false, 100));
        System.out.println("Retiro con identidad verificada: " + ahorro.retirar(101, true, 100));
                        
        cliente.agregarCuenta();
        cliente.agregarCuenta();
        
        System.out.println("---Cliente---");
        System.out.println(cliente);
                
        System.out.println("--- CUENTA DE AHORRO ---");
        
        ahorro.calcularInteresMensual();
        
        System.out.println("Resultado: " + ahorro);
        
        System.out.println("--- PRUEBA DEL SALDO MINIMO ---");
        System.out.println("Retiro de $915: " + ahorro.retirar(101, true, 915));
        System.out.println("Retiro de $914: " + ahorro.retirar(101, true, 914));
        System.out.println("Saldo final de ahorro: $" + ahorro.getSaldo());
        
        System.out.println("--- CUENTA DE INVERSION ---");
        System.out.println("Deposito inicial de $25000: " + inversion.depositar(25000));
        System.out.println("Retiro de $16000 (debe rechazarse): " + inversion.retirar(16000));
        System.out.println("Retiro de $5000: " + inversion.retirar(5000));
        System.out.println("Resultado: " + inversion);
        System.out.println("Dinero devuelto al cancelar: " + "$" + inversion.cancelarCuenta());
        System.out.println("Cuenta despues de cancelar: " + inversion);
        
        System.out.println("--- PRUEBA DE POLIMORFISMO ---");
        CuentaBancaria[] cuentas = {ahorro, inversion};
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }
        System.out.println("--- EMPLEADO ---");
        Empleado empleado = new Empleado(501, "Laura", "Cajera", 1800000, 3);
       
        System.out.println(empleado);
        
        System.out.println("--- CASA INVERSIONISTA ---");
        CasaInversionista casa = new CasaInversionista("INV01", "Historial confiable", "Medio", 12, 500000, 10000000, 12);
        
        System.out.println(casa);
        
        double monto = 1000000;
        System.out.println("Permite invertir $1000000?: " + casa.permiteInversion(monto));
        System.out.println("Retorno estimado: $" + casa.calcularRetornoEstimado(monto));
        
        System.out.println("--- TOTALES DEL SISTEMA ---");
        System.out.println("Personas creadas: " + PersonaNatural.getTotalPersonas());
        System.out.println("Clientes creados: " + Cliente.getTotalClientes());
        System.out.println("Cuentas de ahorro creadas: " + CuentaAhorro.getTotalCuentasAhorro());
        System.out.println("Empleados creados: " + Empleado.getTotalEmpleados());
        System.out.println("Cuentas creadas: " + CuentaBancaria.getTotalCuentas());
        System.out.println("Cuentas de inversion creadas: " + CuentaInversion.getTotalCuentasInversion());
        System.out.println("Casas inversionistas: " + CasaInversionista.getTotalCasas());
        
        System.out.println("===== FIN DEL PROGRAMA =====");
    }
}
