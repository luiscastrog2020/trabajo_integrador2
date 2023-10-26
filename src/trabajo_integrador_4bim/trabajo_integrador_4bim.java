package trabajo_integrador_4bim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trabajo_integrador_4bim {
	public static void main(String[] args) {
		 Scanner datos = new Scanner (System.in);
		 
	int numerosecreto = (int) (Math.random()*100+1);
	int intentos=0;
    int numero;
    
    System.out.println("ingrese un numero enre 1 y 100");
    try { 
	do {
		numero=datos.nextInt();
		if (numero<1 || numero>100) {
            throw new ArithmeticException();
        }	
		
	if(numero<numerosecreto) {
		System.out.println("el numero secreto es mayor al que ingresaste");
	}
	if(numero>numerosecreto) {
		System.out.println("el numero secreto es menor al que ingresaste");
	}
	if(intentos==10) {
		System.out.println("demasiados intentos, PERDISTE");
		break;
	}
	intentos++;
	}while(numerosecreto!=numero);
	
	if(numero==numerosecreto) {
		System.out.println("GANASTE,acertaste al numero secreto");
		System.out.println("tu numero de intentos es:"+intentos);
	}
	     		
	   }
		catch(ArithmeticException e){
			System.out.println("el numero no esta dentro del rango");
		}
	    catch(InputMismatchException e) {
		   System.out.println("el valor ingresado no es valido");
	   }
	
}
}