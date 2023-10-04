package banco.main;

public class GuardarCuenta extends Cuenta {
    
    double interes = 0.06;

    public GuardarCuenta(double saldo) {
        super(saldo);
    }
    

    @Override
    public boolean retiros(double monto) {
      if(monto <= saldo){
        saldo -= monto;
        return true;
    }else{
        return false;
    }
}

    @Override
    public String getDescription() {
        return "cuenta de ahorros";
    }
    
    @Override
    public void deposito(double monto){
        saldo += monto;
        saldo+= saldo*interes;
    }
    
}
