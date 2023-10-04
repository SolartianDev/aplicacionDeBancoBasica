package banco.main;

public abstract class Cuenta {
    protected double saldo;
    
    public Cuenta (double saldo){
        this.saldo = saldo;
    }
    

    public double getSaldo() {
        return saldo;
    }
    
    public void deposito(double monto){
        saldo+= monto;
    }
    
    public abstract boolean retiros(double monto);
    
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription() + ": el saldo de la cuenta es: " + this.getSaldo();
    }
    
    
    
}
