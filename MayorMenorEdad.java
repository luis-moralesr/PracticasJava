import java.util.*;
public class MayorMenorEdad {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int edad;
		System.out.println("Ingrese su edad: ");
		edad = obj.nextInt();
		//Condición que se debe cumplir.
		if(edad>=18) {
			System.out.println("Usted es mayor de edad.");
		//De no cumplirse la condición	
		}else {
			System.out.println("Usted es menor de edad.");
		}
	}
}
