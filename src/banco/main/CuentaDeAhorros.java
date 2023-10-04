
package banco.main;

public class CuentaDeAhorros extends Cuenta {

    private final double limiteDeRetiros;

    public CuentaDeAhorros(double saldo) {
        this(100000.00, saldo);
    }
    
    public CuentaDeAhorros(double limiteDeRetiros, double saldo) {
        super(saldo);
        this.limiteDeRetiros = limiteDeRetiros;
    }
    
    
    @Override
    public boolean retiros(double monto) {
        if(monto <= saldo && monto<= limiteDeRetiros){
         saldo -= monto;
        return true;
     }else return false;
}

    @Override
    public String getDescription() {
    return "cuenta de ahorros";
    }
    
}
