package aprendejava;

public class AprendeJava_02_01 {

	public static void main(String[] args) {
		
		System.out.println("\t\t\t\tResumen de tipos primitivos");
		System.out.println("\n\tTIPO\t\tDESCRIPCIÓN\t\t\tTAMAÑO\t\tEJEMPLO");
		System.out.println("\tboolean\t\tverdadero o falso\t\t1 bit\t\tboolean abierto = true;");
		System.out.println("\tbyte\t\tnúmero entero\t\t\t8 bits\t\tbyte repeticiones = 22;");
		System.out.println("\tchar\t\tcarácter\t\t\t16 bits\t\tchar letra = 'a';");
		System.out.println("\tshort\t\tnúmero entero\t\t\t16 bits\t\tshort pantalones = 22;");
		System.out.println("\tint\t\tnúmero entero\t\t\t32 bits\t\tint asistentes = 22;");
		System.out.println("\tlong\t\tnúmero entero\t\t\t64 bits\t\tlong poblacion = 22L;");
		System.out.println("\tfloat\t\tnúmero con decimales\t\t\t32 bits\t\tfloat nota = 9.5f;");
		System.out.println("\tdouble\t\tnúmero con decimales\t\t\t64 bits\t\tdouble precio = 22.55d;");
		
		System.out.println("\n\n\t\t\t\tOperadores artiméticos");
		System.out.println("\n\n\tOPERADOR\tNOMBRE\t\tEJEMPLO\t\t\t\tDESCRIPCIÓN");
        System.out.println("\t+\t\tsuma\t\t20 + x\t\t\t\tsuma dos números");
        System.out.println("\t-\t\tresta\t\ta - b\t\t\t\tresta dos números");
        System.out.println("\t*\t\tmultiplicación\t10 * 7\t\t\t\tmultiplica dos números");
        System.out.println("\t/\t\tdivisión\taltura / 2\t\t\tdivide dos números");
        System.out.println("\t%\t\tresto (módulo)\t5 % 2\t\t\t\tresto de la división entera");
        System.out.println("\t++\t\tincremento\ta++\t\t\t\tincrementa en 1 el valor de la variable");
        System.out.println("\t--\t\tdecremento\ta--\t\t\t\tdecrementa en 1 el valor de la variable");
        
        int x;
        x = 100;
        System.out.println("\n\n"+ x + " " + (x + 5) + " " + (x - 5));
        System.out.println((x * 5) + " " + (x / 5) + " " + (x % 5));
	}
}