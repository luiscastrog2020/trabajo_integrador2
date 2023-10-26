package trabajo_integrador4_4bim;

import java.util.Scanner;

public class trabajo_integrador4_4bim {
	
	static String[] nombre = new String[3];
	static String[] apellido = new String[3];
	static int[] numero_camisa = new int [3];
	
	
	public static void ingresedatos() {
		  Scanner datos = new Scanner(System.in);
		
		for(int i=0; i<nombre.length; i++) {
			System.out.println("ingrese el nombre del jugador:"+(i+1));
			nombre[i]=datos.next();
			System.out.println("ingrese el apellido del jugador:"+(i+1));
			apellido[i]=datos.next();
			System.out.println("ingrese el numero de camiseta del jugador:"+(i+1));
			numero_camisa[i]=datos.nextInt();
			
		}
		
	}
	
	public static void agregarjugador() {
		  Scanner datos = new Scanner(System.in);
		  String respuesta;
		  
		System.out.println("deseea agregar los datos de un jugador suplente");
		respuesta=datos.next();
		
	}
	

}
