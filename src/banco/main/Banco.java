package banco.main;

public class Banco {
    private Cliente[] clientes;
    private int numeroDeCuentas;

    public Banco() {
        this.clientes = new Cliente[10];
        this.numeroDeCuentas = 0;
    }

    public void agregarCliente(String nombres, String apellidos) {
        if (numeroDeCuentas < clientes.length) {
            clientes[numeroDeCuentas] = new Cliente(nombres, apellidos);
            numeroDeCuentas++;
        } else {
            System.out.println("No se pueden agregar más clientes. "+
                    "El límite ha sido alcanzado.");
        }
    }

    public Cliente getClientes(int indiceDeCliente) {
        return clientes[indiceDeCliente];
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }
}
