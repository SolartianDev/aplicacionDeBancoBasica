package banco.main;

public class CuentaDeAhorros extends Cuenta {
    private final double limiteDeRetiros;   // Variable para almacenar el límite de retiros de la cuenta de ahorros.

    public CuentaDeAhorros(double saldo) {   // Constructor que recibe el saldo inicial de la cuenta.
        this(100000.00, saldo);             // Llama al otro constructor de la clase con un límite de retiros predeterminado.
    }
    
    public CuentaDeAhorros(double limiteDeRetiros, double saldo) {  // Constructor que recibe el límite de retiros y el saldo inicial.
        super(saldo);                     // Llama al constructor de la clase base (Cuenta) para inicializar el saldo.
        this.limiteDeRetiros = limiteDeRetiros;  // Inicializa el límite de retiros de la cuenta de ahorros.
    }
    
    @Override
    public boolean retiros(double monto) {   // Implementación del método retiros definido en la clase base (Cuenta).
        if (monto <= saldo && monto <= limiteDeRetiros) {   // Verifica si el monto a retirar es menor o igual al saldo y al límite de retiros.
            saldo -= monto;                 // Reduce el saldo de la cuenta por el monto retirado.
            return true;                    // Devuelve verdadero para indicar que el retiro se realizó con éxito.
        } else {
            return false;                   // Devuelve falso si no se puede realizar el retiro debido a un saldo insuficiente o exceso de límite.
        }
    }

    @Override
    public String getDescription() {   // Implementación del método getDescription definido en la clase base (Cuenta).
        return "cuenta de ahorros";   // Devuelve una descripción específica para la cuenta de ahorros.
    }
}

