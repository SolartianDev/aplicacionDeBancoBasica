package banco.main;


public class Banco {
    private Cliente[] clientes;           // Arreglo de objetos Cliente para almacenar los clientes del banco.
    private int numeroDeCuentas;         // Contador para realizar un seguimiento del número total de cuentas en el banco.

    public Banco() {
        this.clientes = new Cliente[10];    // Inicializa el arreglo de clientes con capacidad para 10 clientes.
        this.numeroDeCuentas = 0;           // Inicializa el contador de cuentas en 0.
    }

    public void agregarCliente(String nombres, String apellidos) {
        if (numeroDeCuentas < clientes.length) {
            clientes[numeroDeCuentas] = new Cliente(nombres, apellidos);  // Crea un nuevo objeto Cliente y lo agrega al arreglo de clientes.
            numeroDeCuentas++;                                           // Incrementa el contador de cuentas.
        } else {
            System.out.println("No se pueden agregar más clientes. " +
                    "El límite ha sido alcanzado.");
        }
    }

    public Cliente getClientes(int indiceDeCliente) {
        return clientes[indiceDeCliente];   // Obtiene un cliente del arreglo de clientes según su índice.
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;             // Devuelve el número total de cuentas en el banco.
    }
}
