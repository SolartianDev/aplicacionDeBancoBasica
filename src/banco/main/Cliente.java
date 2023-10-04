package banco.main;

public class Cliente {
    private String nombres;            // Almacena los nombres del cliente.
    private String apellidos;          // Almacena los apellidos del cliente.
    private Cuenta[] cuentas;          // Arreglo de objetos Cuenta para almacenar las cuentas del cliente.
    private int numeroDeCuentas;       // Contador para realizar un seguimiento del número de cuentas del cliente.

    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;                   // Inicializa los nombres del cliente con el valor proporcionado.
        this.apellidos = apellidos;               // Inicializa los apellidos del cliente con el valor proporcionado.
        
        this.cuentas = new Cuenta[10];            // Inicializa el arreglo de cuentas con capacidad para 10 cuentas.
        this.numeroDeCuentas = 0;                 // Inicializa el contador de cuentas en 0.
    }
    
    public void agregarCuenta(Cuenta cuenta) {
        if (numeroDeCuentas < cuentas.length) {
            cuentas[numeroDeCuentas] = cuenta;     // Agrega un nuevo objeto Cuenta al arreglo de cuentas del cliente.
            numeroDeCuentas++;                     // Incrementa el contador de cuentas después de agregar la cuenta.
        } else {
            System.out.println("No se pueden agregar más cuentas. El límite ha sido alcanzado.");
        }
    }

    public String getNombres() {
        return nombres;                            // Devuelve los nombres del cliente.
    }

    public String getApellidos() {
        return apellidos;                          // Devuelve los apellidos del cliente.
    }

    public Cuenta getCuenta(int indiceCuentas) {
        return cuentas[indiceCuentas];             // Obtiene una cuenta del cliente según su índice.
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;                    // Devuelve el número total de cuentas del cliente.
    }
}
