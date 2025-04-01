package entornos1;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Captura por teclado y asignación de las notas
		System.out.println("Introduce la nota del examen práctico: ");
		int exPractico = sc.nextInt();

		System.out.println("Introduce la nota del examen teórico: ");
		int exTeorico = sc.nextInt();

		System.out.println("Introduce la nota de las actividades: ");
		int actividades = sc.nextInt();

		System.out.println("Introduce la nota de asistencia: ");
		int asistencia = sc.nextInt();

		sc.close(); // Cerramos el escáner

		// Cálculo del promedio
		int promedio = (exPractico + exTeorico + actividades + asistencia) / 4;

		// Verificar si el alumno aprueba
		boolean esAprobado = promedio >= 5;

		// Mostramos información por consola
		System.out.println("***** Resultados *****");
		System.out.println("Nota examen práctico: " + exPractico);
		System.out.println("Nota examen teórico: " + exTeorico); // Se corrigió la referencia de la nota
		System.out.println("Nota actividades: " + actividades);
		System.out.println("Nota asistencia: " + asistencia);
		System.out.println("El promedio es: " + promedio);

		// Se debe verificar que todas las notas sean al menos 4
		boolean notasSuficientes = (exPractico >= 4) && (exTeorico >= 4) && (actividades >= 4) && (asistencia >= 4);

		if (esAprobado && notasSuficientes) {
			System.out.println("El alumno ha aprobado.");
		} else {
			System.out.println("El alumno ha suspendido.");
		}

		System.out.println("***** Fin del programa *****");
	}
}
