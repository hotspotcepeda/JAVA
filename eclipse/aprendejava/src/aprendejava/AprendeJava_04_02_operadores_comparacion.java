package aprendejava;

public class AprendeJava_04_02_operadores_comparacion {

	public static void main(String[] args) {

		System.out.println("\n\t\t\tOperadores de comparación.");
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("OPERADOR\tNOMBRE\t\t\tEJEMPLO\t\tDESCRIPCIÓN");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("==\t\tigual a\t\t\t== b\t\ta es igual a b");
		System.out.println("!=\t\tdistinto a\t\t!= b\t\ta es distinto de b");
		System.out.println("<\t\tmenor que\t\t< b\t\ta es menor que b");
		System.out.println(">\t\tmayor que\t\t> b\t\ta es mayor que b");
		System.out.println("<=\t\tmenor o igual que\t<= b\t\ta es menor o igual que b");
		System.out.println(">=\t\tmayor o igual que\t>= b\t\ta es mayor o igual que b");
		System.out.println("\n--------------------------------------------------------------------------------");
		
		int a = 10;
		int b = 20;
		
		System.out.println("\na ="+a);
		System.out.println("b ="+b);
		
		System.out.println("\na == b: \t" + (a == b)); // false
		System.out.println("a != b: \t" + (a != b)); // true
		System.out.println("a < b: \t\t" + (a < b)); // true
		System.out.println("a > b: \t\t" + (a > b)); // false
		System.out.println("a <= b: \t" + (a <= b)); // true
		System.out.println("a >= b: \t" + (a >= b)); // false
		
		System.out.println("\n--------------------------------------------------------------------------------");
		
		System.out.println("\n\t\t\tOperadores lógicos.");
		System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("OPERADOR\tNOMBRE\t\tEJEMPLO\t\tDEVUELVE VERDADERO CUANDO...");
        System.out.println("&&\t\ty\t (7 > 2) && (2 < 4)\tlas dos condiciones son verdaderas");
        System.out.println("||\t\to\t (7 > 2) || (2 < 4)\tal menos una de las condiciones es verdadera");
        System.out.println("!\t\tno\t !(7 > 2)\t\tla condición es falsa");
        
        System.out.println("\n--------------------------------------------------------------------------------");
    }
}


