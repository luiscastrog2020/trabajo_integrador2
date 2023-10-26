package trabajo_integrador2_4bim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trabajo_integrador2_4bim {

   private static final boolean InputMismatchException = false;
static float n1,n2;
   static int elegir;
   
   public static void ingresarNumeros() {
	   try {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un primer numero: ");
	    n1 = entrada.nextFloat();
	    System.out.println("Ingresa un segundo numero: ");
	    n2 = entrada.nextFloat();
   } catch (InputMismatchException e) {
	   System.out.println("Error: Debes ingresar un dato valido.");
   }
	}
   
   
   public static float sumar(float a, float b) {
	    float suma = a + b;
	    return suma;
	}
   public static float restar(float a,float b) {
	    float resta = a - b;
	    return resta;
	}
   public static float multiplicar(float a, float b) {
	    float multiplicacion = a*b;
	    return multiplicacion;
	}
   public static float dividir(float a, float b) {
	    float division = a/b;
	    return division;
	}
   
   public static void main (String[] args){
	   Scanner entrada = new Scanner(System.in);
	 char salir = 0;  
	   
	 do{
	 System.out.println("que operacion matematica deseea elegir");
	 System.out.println("1-suma");
	 System.out.println("2-resta");
	 System.out.println("3-multiplicacion");
	 System.out.println("4-division");
	 try {
		   elegir= entrada.nextInt(); 
		 }catch(InputMismatchException e) {
			 System.out.println("error. dato no valido");
			 break;
		 } 
     
	 switch(elegir) {
	 case 1 :ingresarNumeros();
		     sumar(n1,n2);
		     System.out.println("el resultado de la suma es:"+sumar(n1,n2));
	 break;
	 
	 case 2 :ingresarNumeros();
	         restar(n1,n2);
	         System.out.println("el resultado de la resta es:"+restar(n1,n2));
	 break;
	 
	 case 3 :ingresarNumeros();
		     multiplicar(n1,n2);
		     System.out.println("el resultado de la multiplicacion es:"+multiplicar(n1,n2));
	 break;
	 
	 case 4 :ingresarNumeros();
	 
	         try {
		     dividir(n1,n2);
		     System.out.println("el resultado de la division es:"+dividir(n1,n2));
		     
		     if(n1<=0 || n2<=0) {
		    	 throw new ArithmeticException();
		     }
		     
	         }catch (ArithmeticException e){
	             System.out.println("Error: Division por cero o numero negativo.");
	         }
		     
	 break;
	 
	 default:System.out.println("esa opcion no existe");
			break;
	 }
	 System.out.println("deseea salir s/n");
	 salir=entrada.next().charAt(0);
	 
	 while(salir!='s' && salir!='n') {
	 if(salir!='s' && salir!='n') {
		 System.out.println("esa opcion no existe.elija una opcion");
		 salir=entrada.next().charAt(0);
	 }
	 }
	 }while(salir=='n');

   }
}
