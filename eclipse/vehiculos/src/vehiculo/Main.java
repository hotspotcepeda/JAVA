package vehiculo;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Vehiculo
    	
        Vehiculo vehiculo1 = new Vehiculo("", "Rojo", "BH", "Granate");
        System.out.println("Vehiculo: Bici \n" + vehiculo1);
        
        System.out.println("\n\t\t +++++++++++++++ \n");
        
        Vehiculo vehiculo2 = new Vehiculo("", "Blanca", "G.A.C.", "AKIMOTO AK-M4");
        System.out.println("Vehiculo: Bici \n" + vehiculo2);
        
        System.out.println("\n\t\t +++++++++++++++ \n");
        
        Coche cohe1 = new Coche("M-1273-LG", "Rojo", "Peugeot", "405", 5);
        System.out.println("Vehiculo: Coche \n" + cohe1);
        
        System.out.println("\n\t\t +++++++++++++++ \n");
        
        Coche cohe2 = new Coche("2543-CBG", "Rojo", "Peugeot", "206", 5);
        System.out.println("Vehiculo: Coche \n" + cohe2);
        
        System.out.println("\n\t\t +++++++++++++++ \n");
        
        Coche cohe3 = new Coche("M-8746-ST", "Blanco", "VW", "Transporter", 5);
        System.out.println("Vehiculo: Fugoneta \n" + cohe3);
       
        System.out.println("\n\t\t +++++++++++++++ \n");
        
        Moto moto1 = new Moto("M-2358-NG", "Rojo", "Yamaha", "Hayabusa", 900);
        System.out.println("Vehiculo: Moto \n" + moto1);
        
        System.out.println("\n\t\t +++++++++++++++ \n");
        
        Camion camion1 = new Camion("1978-FPW", "Blanco", "Mercedes", "Unimog", 1700);
        System.out.println("Vehiculo: Camion \n" + camion1);
        
        
        
        


        
        
        
    /*   // Crear un objeto de la clase Coche
        Coche c1 = new Coche("5678DEF", "Azul", 5);
        System.out.println("Coche: " + c1);

        // Crear un objeto de la clase Moto
        Moto m1 = new Moto("9012GHI", "Negro", 750);
        System.out.println("Moto: " + m1);

        // Crear un objeto de la clase Camion
        Camion ca1 = new Camion("3456JKL", "Blanco", 2000);
        System.out.println("Camion: " + ca1);
    */
    }
}