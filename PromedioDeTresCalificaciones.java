import java.util.*;
public class PromedioDeTresCalificaciones {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		double calificacion1, calificacion2, calificacion3, promedio;
		System.out.println("Ingrese calificación 1");
		calificacion1 = obj.nextDouble();
		System.out.println("Ingrese calificación 2");
		calificacion2 = obj.nextDouble();
		System.out.println("Ingrese calificación 3");
		calificacion3 = obj.nextDouble();
		promedio = (calificacion1+calificacion2+calificacion3)/3;
		System.out.println("El promedio es: "+promedio);
	}
}
