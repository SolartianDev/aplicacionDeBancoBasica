package banco.main;

public abstract class Cuenta {
    protected double saldo;                // Variable para almacenar el saldo de la cuenta.
    
    public Cuenta(double saldo) {           // Constructor que recibe el saldo inicial de la cuenta.
        this.saldo = saldo;                 // Inicializa el saldo de la cuenta con el valor proporcionado.
    }
    
    public double getSaldo() {              // Método para obtener el saldo actual de la cuenta.
        return saldo;                       // Devuelve el saldo de la cuenta.
    }
    
    public void deposito(double monto) {     // Método para realizar un depósito en la cuenta.
        saldo += monto;                     // Aumenta el saldo de la cuenta por el monto especificado.
    }
    
    public abstract boolean retiros(double monto);   // Método abstracto para realizar retiros, debe ser implementado por subclases.
    
    public abstract String getDescription();         // Método abstracto para obtener una descripción de la cuenta, debe ser implementado por subclases.

    @Override
    public String toString() {
        return getDescription() + ": el saldo de la cuenta es: " + this.getSaldo();   // Devuelve una representación en cadena de la cuenta.
    }
}

    
    
    

