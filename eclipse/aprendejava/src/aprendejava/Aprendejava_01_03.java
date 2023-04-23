package aprendejava;

public class Aprendejava_01_03 {



	private static String black = "\033[30m";
	private static String red = "\033[31m";
	private static String green = "\033[32m";
	private static String yellow = "\033[33m";
	private static String blue = "\033[34m";
	private static String purple = "\033[35m";
	private static String cyan = "\033[36m";
	private static String white = "\033[37m";
	private static String reset = "\u001B[0m";

	public static void main(String args[]) {
		   String black="\033[30m"; 
		   String red="\033[31m"; 
		   String green="\033[32m"; 
		   String yellow="\033[33m"; 
		   String blue="\033[34m"; 
		   String purple="\033[35m"; 
		   String cyan="\033[36m"; 
		   String white="\033[37m"; 
		   String reset="\u001B[0m";
		   System.out.println(); 
		   System.out.println(red+"Cadena de texto en rojo"+reset); 
		   System.out.println(green+"Cadena de texto en verde"+reset); 
		   System.out.println(yellow+"Cadena de texto en amarillo"+reset); 
		   System.out.println(white+"Cadena de texto en white <- cadena de texto en blanco"+reset); 
		   System.out.println(black+"Cadena de texto en negro"+reset+" <- cadena de texto en negro"+reset); 
		   System.out.println(blue+"Cadena de texto en azul"+reset); 
		   System.out.println(purple+"Cadena de texto en magenta"+reset); 
		   System.out.println(cyan+"Cadena de texto en cyan"+reset); 
		   System.out.println(reset+"Cadena de texto en color por defecto"+reset); 
		   System.out.println();
		   
	        System.out.println("\033[0m BLACK");
	        System.out.println("\033[31m RED");
	        System.out.println("\033[32m GREEN");
	        System.out.println("\033[33m YELLOW");
	        System.out.println("\033[34m BLUE");
	        System.out.println("\033[35m MAGENTA");
	        System.out.println("\033[36m CYAN");
	        System.out.println("\033[37m WHITE");
	        
	        System.out.print("\033[33m mandarina");
	        System.out.print("\033[32m hierba");
	        System.out.print("\033[31m tomate");
	        System.out.print("\033[37m sábanas");
	        System.out.print("\033[36m cielo");
	        System.out.print("\033[35m nazareno");
	        System.out.print("\033[34m mar");
	        
	        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
	        System.out.println("│ Código │ Color │ Código │ Color │");
	        System.out.println("├────────┼───────────┼────────┼────────────────┤");
	        System.out.print("│ 30 │\033[30m negro \033[39;49m │");
	        System.out.println(" 90 │\033[90m negro claro \033[39;49m │");
	        System.out.print("│ 31 │\033[31m rojo \033[39;49m │");
	        System.out.println(" 91 │\033[91m rojo claro \033[39;49m │");
	        System.out.print("│ 32 │\033[32m verde \033[39;49m │");
	        System.out.println(" 92 │\033[92m verde claro \033[39;49m │");
	        System.out.print("│ 33 │\033[33m amarillo \033[39;49m │");
	        System.out.println(" 93 │\033[93m amarillo claro \033[39;49m│");
	        System.out.print("│ 34 │\033[34m azul \033[39;49m │");
	        System.out.println(" 94 │\033[94m azul claro \033[39;49m │");
	        System.out.print("│ 35 │\033[35m morado \033[39;49m │");
	        System.out.println(" 95 │\033[95m morado claro \033[39;49m │");
	        System.out.print("│ 36 │\033[36m cian \033[39;49m │");
	        System.out.println(" 96 │\033[96m cian claro \033[39;49m │");
	        System.out.print("│ 37 │\033[37m blanco \033[39;49m │");
	        System.out.println(" 97 │\033[97m blanco claro \033[39;49m │");
	        System.out.println("└────────┴───────────┴────────┴────────────────┘");
	        }
	        }