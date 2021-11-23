
package examencristinahidalgocobo;

import java.util.Scanner;


public class CuentaCorriente {
    Titular elTitular;
    private String numCuenta;
    private double saldo;

    //constructor con todos los atributos
    public CuentaCorriente(Titular elTitular, String numCuenta, double saldo) {
        this.elTitular = elTitular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    //constructor sin saldo que lo inicia en 15.5

    public CuentaCorriente(Titular elTitular, String numCuenta) {
        this.elTitular = elTitular;
        this.numCuenta = numCuenta;
        this.saldo=15.5;
    }
    
    //Get para todos los atributos

    public Titular getElTitular() {
        return elTitular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //set para el saldo

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //metodo ingresar que incremente el saldo en una cantidad que le pasa por teclado
    
    public void ingresarSaldo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Teclee la cantidad a ingresar");
        double ingreso=input.nextInt();
        
        if (ingreso<0) {
            System.out.println("No es posible realizar la operación");
            
        }else if (ingreso>=0) {
            System.out.println("Su saldo actual es de: "+(this.saldo+ingreso));
            
        }
        
    }
    
    
    //metodo imprimir cuenta imprime la info de la cuenta y la del titular
    
    public void imprimirCuenta(){
        System.out.println("Información sobre la cuenta");
        System.out.println();
        System.out.println("El títular es: "+this.elTitular+"\n El número de"
                + " cuenta es: "+this.numCuenta+ "\n El saldo disponible es: "
        +this.saldo);
               
    }
    
    
    //metodo retirar saldo, pide al usuario que introduzca el saldo a retirar
    //debe restar el saldo retirado pero solo si no lo deja a 0
    //no puede sacar una cantidad negativa, sería fin del programa
        public void retirarSaldo(){
            Scanner input=new Scanner(System.in);
            System.out.println("Teclee el saldo que desea retirar: ");
            double saldoRetirar=input.nextInt();
            double saldoTotal=this.saldo-saldoRetirar;
        
        
                if (saldoRetirar>0 && (saldoTotal>0)) {
                    System.out.println("Saldo disponible: "+saldoTotal );
            
                    }else{
                        System.out.println("Operación no válida");
            
                    }
        
        }
        
        //método retirar saldo en el cual se pasa por parámetro la cantidad 
        //a retirar
     
        public void retirarSaldo(double cantidad){
            Scanner input=new Scanner(System.in);
            System.out.println("Introduce una cantidad a retirar");
            cantidad=input.nextDouble();
            double saldoTotal=this.saldo-cantidad;
            
                if (cantidad>0 && (saldoTotal>0)) {
                    System.out.println("Saldo disponible: "+saldoTotal );
            
                    }else{
                        System.out.println("Operación no válida");
            
                        }
        }
            
            
         //metodo que compruebe si el saldo es positivo o negativo y diga el número
         //de cuenta y si su saldo es positivo o negativo (0 se considera positivo)
         
        public void comprobarSaldo(){
            if (this.saldo>=0) {
                 System.out.println("Tiene usted en su cuenta"
                         + " número "+this.numCuenta+" un saldo positivo de: "
                         +this.saldo);
                 
                }else{
                    System.out.println("Tiene usted en su cuenta"
                    + " número "+this.numCuenta+" un saldo negativo de: "
                    +this.saldo);
                 
                    }
            }
        
        //metodo comparar cuentas que compare la cuenta this con otra que se pasa
        //por parámetro
        
        public void compararCuentas(){
            String nuevaCuenta="33447788";
            double nuevoSaldo=1300.0;
            
            if (this.saldo>nuevoSaldo) {
                System.out.println("La cuenta "+this.numCuenta+" tiene un saldo "
                        + " mayor que la cuenta: "+nuevaCuenta);
                
            }else if (this.saldo==nuevoSaldo) {
                System.out.println("La cuenta "+this.numCuenta+" tiene el mismo"
                        + " saldo que la cuenta: "+nuevaCuenta);
                
            }else{
                System.out.println("La cuenta "+this.numCuenta+" tiene un saldo "
                        + " inferior a la cuenta: "+nuevaCuenta);
            }
            
            
            
        }
        
        //metodo es igual que compara la cuenta this con otra pasada por parámetro
        //y dice si son iguales. Dichas cuentas serán iguales si su numCuenta es el
        //mismo
        
        public void esIgual(){
            String nuevaCuenta="44455566";
            
            if (this.numCuenta!=nuevaCuenta) {
                System.out.println("Los números de cuenta son diferentes");
                
            }else{
                System.out.println("Los números de cuenta son iguales");
                        
            }
            
        }
        
    
    
    
    
    
    
    
}
