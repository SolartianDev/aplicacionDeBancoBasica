package banco.main;

public class ReporteDeClientes {
    private Banco banco;  // Declaración de una variable de instancia "banco" de tipo Banco.

    public Banco getBanco(){  // Método getter para obtener el objeto "banco".
        return banco;  // Devuelve el objeto "banco".
    }

    public void setBanco(Banco banco) {  // Método setter para establecer el objeto "banco".
        this.banco = banco;  // Asigna el objeto "banco" pasado como argumento al campo "banco" de la clase.
    }

    public void generarReporte() {  // Método para generar un reporte de clientes.
        System.out.println("\t\t\tREPORTE DE CLIENTES");  // Imprime un encabezado para el reporte.
        System.out.println("\t\t\t==================");  // Imprime una línea separadora.

        for (int i = 0; i < banco.getNumeroDeCuentas(); i++) {  // Inicia un bucle que recorre las cuentas en el banco.
            Cliente c = banco.getClientes(i);  // Obtiene un cliente del banco en la posición i.

            System.out.println();  // Imprime una línea en blanco para separar a cada cliente en el reporte.
            System.out.println("Cliente " + c.getNombres() + ", " + c.getApellidos());  // Imprime el nombre y apellidos del cliente.

            for (int j = 0; j < c.getNumeroDeCuentas(); j++) {  // Inicia un bucle que recorre las cuentas del cliente.
                Cuenta cuenta = c.getCuenta(j);  // Obtiene una cuenta del cliente en la posición j.
                System.out.println("    " + cuenta);  // Imprime información sobre la cuenta.
            }
        }
    }
}

