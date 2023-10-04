package banco.main;

public class MainAbstraccion {

    public static void main(String[] args) {
        Banco banco = new Banco();  // Crea un nuevo objeto Banco para representar el banco.
        inicializarClientes(banco);  // Llama al método para inicializar clientes y cuentas en el banco.

        ReporteDeClientes reporte = new ReporteDeClientes();  // Crea un nuevo objeto ReporteDeClientes para generar informes.
        reporte.setBanco(banco);  // Asigna el objeto Banco al ReporteDeClientes.
        reporte.generarReporte();  // Genera el informe de clientes.
    }

    private static void inicializarClientes(Banco banco) {
        // Agregar clientes y cuentas al banco

        banco.agregarCliente("Cristiano", "Ronaldo");  // Agrega un cliente llamado Cristiano Ronaldo al banco.
        Cliente cliente = banco.getClientes(0);  // Obtiene el cliente en la posición 0 (Cristiano Ronaldo).
        cliente.agregarCuenta(new GuardarCuenta(500.00));  // Agrega una cuenta de ahorros al cliente Cristiano Ronaldo con un saldo de 500.00.

        banco.agregarCliente("Radamel", "Falcao");  // Agrega un cliente llamado Radamel Falcao al banco.
        cliente = banco.getClientes(1);  // Obtiene el cliente en la posición 1 (Radamel Falcao).
        GuardarCuenta cuenta = new GuardarCuenta(300.00);  // Crea una cuenta de ahorros con un saldo inicial de 300.00.
        cliente.agregarCuenta(cuenta);  // Asigna la cuenta al cliente Radamel Falcao.
        cuenta.deposito(100.00);  // Realiza un depósito de 100.00 en la cuenta.

        banco.agregarCliente("Anual", "AA");  // Agrega un cliente llamado Anual AA al banco.
        cliente = banco.getClientes(2);  // Obtiene el cliente en la posición 2 (Anual AA).
        cliente.agregarCuenta(new GuardarCuenta(400.00));  // Agrega una cuenta de ahorros al cliente Anual AA con un saldo de 400.00
        // Crear una nueva cuenta y asignarla al cliente
        GuardarCuenta cuenta1 = new GuardarCuenta(1000.00);  // Crea una nueva cuenta de ahorros con un saldo de 1000.00.
        cuenta1.retiros(50.00);  // Realiza un retiro de 50.00 de la cuenta.
        cliente.agregarCuenta(cuenta1);  // Asigna la nueva cuenta al cliente.

        // Asegúrate de que la cuenta1 se ha asignado al cliente y muestra información sobre la cuenta.
        System.out.println("Cliente " + cliente.getNombres() + ", " + cliente.getApellidos());
        System.out.println("    " + cuenta1);
    }
}
