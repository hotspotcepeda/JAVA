public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con un titular
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", "12345678A", 1000.0);
        
        // Crear una cuenta con dos titulares
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana Gomez", "Pedro Martinez", "87654321B", 500.0);
        
        // Mostrar los datos de las cuentas usando toString y los getters
        System.out.println(cuenta1.toString());
        System.out.println("Titular 1: " + cuenta1.getTitular1());
        System.out.println("Titular 2: " + cuenta1.getTitular2());
        System.out.println("DNI: " + cuenta1.getDni());
        System.out.println("Cantidad: " + cuenta1.getCantidad());
        
        System.out.println(cuenta2.toString());
        System.out.println("Titular 1: " + cuenta2.getTitular1());
        System.out.println("Titular 2: " + cuenta2.getTitular2());
        System.out.println("DNI: " + cuenta2.getDni());
        System.out.println("Cantidad: " + cuenta2.getCantidad());
        
        // Modificar los datos de las cuentas usando los setters
        cuenta1.setCantidad(2000.0);
        cuenta2.setTitular2("Marta Rodriguez");
        
        // Realizar ingresos y retiradas en las cuentas
        cuenta1.ingresar(500.0);
        cuenta2.retirar(200.0);
        
        // Mostrar los datos actualizados de las cuentas
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}