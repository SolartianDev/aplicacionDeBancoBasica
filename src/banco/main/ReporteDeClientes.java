package banco.main;

public class ReporteDeClientes {
    private Banco banco;

   public Banco getBanco(){
       return banco;
   }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
   public void generarReporte() {
    System.out.println("\t\t\tREPORTE DE CLIENTES");
    System.out.println("\t\t\t==================");

    for (int i = 0; i < banco.getNumeroDeCuentas(); i++) {
        Cliente c = banco.getClientes(i);

        System.out.println();
        System.out.println("Cliente " + c.getNombres() + ", " + c.getApellidos());

        for (int j = 0; j < c.getNumeroDeCuentas(); j++) { // Cambié la variable i a j
            Cuenta cuenta = c.getCuenta(j); // Cambié la variable i a j
            System.out.println("    " + cuenta);
        }
    }
}


    
}
