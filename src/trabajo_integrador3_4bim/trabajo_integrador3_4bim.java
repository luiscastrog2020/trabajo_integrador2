package trabajo_integrador3_4bim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trabajo_integrador3_4bim {
	
	static String[] titulo_libro= {"La invención de Morel","El castigo de Dios","El mundo contemporáneo","El silenciero","El matadero","Nadie nada nunca","Memoria romana","El juguete rabioso","Caballo en el salitral"};
	static String[] autor_libro= {"Horacio","Ernesto","Alejandro","Julio","Ricardo","Antonio","Felipe","Esteban","Rodolfo"};
	static int[] numero_paginas= {124,200,265,175,225,192,323,257,189};
	

	public static void lista() {
		
		for(int i=0; i<9 ;i++) {
			System.out.println("titulo del libro:"+titulo_libro[i]+",autor:"+autor_libro[i]+", numero de paginas:"+numero_paginas[i]);	
			System.out.println("\n ");
		}
			
	}
	
	public static void buscar(){
	  Scanner entrada = new Scanner(System.in);
		
		boolean encontrar=false;
		String buscar;
		
		  System.out.println("escriba el nombre de un libro para buscarlo");
		   buscar=entrada.nextLine();
		
		 
		for(int i=0; i<9; i++) {
			
			if(titulo_libro[i].equalsIgnoreCase(buscar)) {
				encontrar=true;
			}			
		}
		if(encontrar==true) {
			  System.out.println("se enconro el libro");
		  }
		  else {
			  System.out.println("no se encontro lo buscado");
		  }
		
	}
	
	public static void main(String[] args) {
		 Scanner datos = new Scanner (System.in);
		 
		 char salir = 0;  
		 int elegir;
		 
		 do {
		
			 System.out.println("que opcion deseea elegir");
			 System.out.println("1-ver lista de informacion de los libros");
			 System.out.println("2-buscar un libro");
			 System.out.println("3-salir");
			 try {
			 elegir= datos.nextInt(); 
			 }catch(InputMismatchException e) {
				 System.out.println("error. dato no valido");
				 break;
			 }
				 
		 
	     switch(elegir) {
	     
	     case 1: System.out.println("los libros disponible son:"); 
	             lista();
	     break;        
	             
	     case 2: System.out.println("busca un libro");    
	             buscar();
	     break;        
	             
	     case 3: System.out.println("programa finalizado");
	     break;
	     
		 default:System.out.println("esa opcion no existe");
			break;
	     }
	   
		 }while( elegir!=3);
}
	
}