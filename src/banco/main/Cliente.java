package banco.main;

public class Cliente {
    
    private String nombres;
    private String apellidos;
    private Cuenta[] cuentas;
    private int numeroDeCuentas;

    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        
        this.cuentas = new Cuenta [10];
        this.numeroDeCuentas = 0;
    }
    
      public void agregarCuenta(Cuenta cuenta) {
        if (numeroDeCuentas < cuentas.length) {
            cuentas[numeroDeCuentas] = cuenta;
            numeroDeCuentas++; // Incrementa el contador después de agregar la cuenta
        } else {
            System.out.println("No se pueden agregar más cuentas. El límite ha sido alcanzado.");
        }
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Cuenta getCuenta(int indiceCuentas) {
        return cuentas[indiceCuentas];
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }
    
    
    
}
