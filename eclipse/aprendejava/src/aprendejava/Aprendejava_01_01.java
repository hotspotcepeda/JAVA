package aprendejava;

public class Aprendejava_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRUEBA \n de CARACTERES ESPECIALES \nññññññ óóóóoó´`oòòoò¡¡¡¡¡¡¡¡¡");
		System.out.println("IMPRIMIENDO TABLA DE CARACTERES ANSI");
        System.out.println("Decimal\tHex\tOctal\tCaracter");

        for (int i = 0; i <= 255; i++) {
            char c = (char) i;
            String hex = String.format("%02x", i);
            String octal = String.format("%03o", i);
            System.out.printf("%d\t%s\t%s\t%c\n", i, hex, octal, c);
        }
    }
}