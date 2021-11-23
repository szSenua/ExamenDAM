
package examen;


public class Maintitularesycuentas {
    
    public static void main(String[] args) {
        //Crear titulares
        
        Titular t1=new Titular("Cristina", "Hidalgo", 31);
        Titular t2=new Titular("Leandro", "Gao", 35);
        Titular t3=new Titular("Bruce", "Wayne", 40);
        
        //Crear cuentas
        
        CuentaCorriente c1=new CuentaCorriente(t1, "3344556677", 1400.0);
        CuentaCorriente c2=new CuentaCorriente(t2, "44455566", 0.0);
        CuentaCorriente c3=new CuentaCorriente(t3, "55221199", 1500.0);
        
        
        c1.comprobarSaldo();
        System.out.println();
        c1.ingresarSaldo();
        System.out.println();
        c1.imprimirCuenta();
        System.out.println();
        c2.esIgual();
        System.out.println();
        c3.retirarSaldo();
        System.out.println();
        c3.compararCuentas();
        System.out.println();
        c3.comprobarSaldo();
        
    }
}
