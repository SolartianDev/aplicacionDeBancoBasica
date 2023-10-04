package banco.main;

public class GuardarCuenta extends Cuenta {
    double interes = 0.06;  // Tasa de interés para la cuenta de ahorros.

    public GuardarCuenta(double saldo) {
        super(saldo);        // Llama al constructor de la clase base (Cuenta) para inicializar el saldo.
    }
    
    @Override
    public boolean retiros(double monto) {  // Implementación del método retiros definido en la clase base (Cuenta).
        if (monto <= saldo) {    // Verifica si el monto a retirar es menor o igual al saldo.
            saldo -= monto;      // Reduce el saldo de la cuenta por el monto retirado.
            return true;         // Devuelve verdadero para indicar que el retiro se realizó con éxito.
        } else {
            return false;        // Devuelve falso si no se puede realizar el retiro debido a un saldo insuficiente.
        }
    }

    @Override
    public String getDescription() {  // Implementación del método getDescription definido en la clase base (Cuenta).
        return "cuenta de ahorros";  // Devuelve una descripción específica para la cuenta de ahorros.
    }
    
    @Override
    public void deposito(double monto) {  // Implementación del método deposito definido en la clase base (Cuenta).
        saldo += monto;        // Aumenta el saldo de la cuenta por el monto depositado.
        saldo += saldo * interes;  // Aplica la tasa de interés al saldo actual.
    }
}

