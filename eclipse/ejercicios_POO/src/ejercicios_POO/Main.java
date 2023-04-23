package ejercicios_POO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r = new Rectangulo();
		Rectangulo r1 = new Rectangulo(4);
		Rectangulo r2 = new Rectangulo(10, 20);
		Rectangulo r3 = new Rectangulo(r);

		Rectangulo r4 = new Rectangulo(r1.getAlto());
		System.out.println(r.getAlto());

		System.out.println(r2.getAncho());
		r2.setAncho(30);
		System.out.println(r2.getAncho());
		
		System.out.println(r2.toString());

	}

}
