package banco.main;

    public class MainAbstraccion {

    public static void main(String[] args) {
        Banco banco = new Banco();
        inicializarClientes(banco);

        ReporteDeClientes reporte = new ReporteDeClientes();
        reporte.setBanco(banco);
        reporte.generarReporte();
    }
    private static void inicializarClientes(Banco banco) {
    // Agregar clientes y cuentas

    banco.agregarCliente("Cristiano", "Ronaldo");
    Cliente cliente = banco.getClientes(0);
    cliente.agregarCuenta(new GuardarCuenta(500.00));

    banco.agregarCliente("Radamel", "Falcao");
    cliente = banco.getClientes(1);
    GuardarCuenta cuenta = new GuardarCuenta(300.00);
    cliente.agregarCuenta(cuenta);
    cuenta.deposito(100.00);

    banco.agregarCliente("Anual", "AA");
    cliente = banco.getClientes(2);
    cliente.agregarCuenta(new GuardarCuenta(400.00));

    banco.agregarCliente("Conejo", "Malo");
    cliente = banco.getClientes(3);
    cliente.agregarCuenta(new GuardarCuenta(900.00));

    banco.agregarCliente("Jose", "Garzon");
    cliente = banco.getClientes(4);
    cliente.agregarCuenta(new GuardarCuenta(1000.00));

    banco.agregarCliente("Sofia Hernandez", "Hernandez");
    cliente = banco.getClientes(5);

    // Crear una nueva cuenta y asignarla al cliente
    GuardarCuenta cuenta1 = new GuardarCuenta(1000.00);
    cuenta1.retiros(50.00);
    cliente.agregarCuenta(cuenta1);

    // Asegúrate de que la cuenta1 se ha asignado al cliente
    System.out.println("Cliente " + cliente.getNombres() + ", " + cliente.getApellidos());
    System.out.println("    " + cuenta1);
 }
}