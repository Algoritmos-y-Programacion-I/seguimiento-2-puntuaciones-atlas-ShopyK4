// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {
	static Scanner escaner = new Scanner(System.in);

	// Declaración del Escaner que nos ayudará en todo el programa

	// Declaración de nuestras constantes a utilizar

	
	public void run()
	{
		// Declaracion de todas las variables a usar en el programa
		
		System.out.println("Ingrese la cantidad de jugadores: ");
		int cantidadJugadores = escaner.nextInt();
		System.out.println("Ingrese la cantidad de rondas: ");
		int cantidadRondas = escaner.nextInt();
		int [] jugadores = arregloJugadores(cantidadJugadores);
		jugadores = puntajeRondas(jugadores, cantidadRondas);
		resultadoTorneo(jugadores, cantidadRondas);


		// Notificacion al usuario de la solicitud de dato

		// Capturamos el dato con nuestro Scanner (que se llama, escaner)



		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados


	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */


	public static int[] arregloJugadores(int cantidadJugadores) {
		int [] jugadores = new int [cantidadJugadores];
		return jugadores;

	} 
	public static int[] puntajeRondas(int[] jugadores, int cantidadRondas) {
     for (int i = 0; i < jugadores.length; i++) { 
        jugadores[i] = registrarPuntajePorRondas(i, cantidadRondas);
    }
    return jugadores;

}
	public static int registrarPuntajePorRondas(int jugador, int cantidadRondas) {
    	int puntajeTotal = 0;
    for (int i = 0; i < cantidadRondas; i++) { 
        System.out.println("Ingrese el puntaje del jugador " + (jugador + 1) + " en la ronda " + (i + 1) + ": ");
        puntajeTotal += escaner.nextInt();

    }
	metodoPromedio(puntajeTotal, cantidadRondas);
    return puntajeTotal;
}
	public static void resultadoTorneo(int[] jugadores, int cantidadRondas) {
        System.out.println("Resultados del torneo:");
		int jugadorGanador = puntuacionAlta(jugadores);
        for (int i = 0; i < jugadores.length; i++) { 
            double promedio = metodoPromedio(jugadores[i], cantidadRondas);
            System.out.println("El puntaje total del jugador " + (i + 1) + " es: " + jugadores[i] +" El promedio por ronda: " + promedio);
        }
		System.out.println("El jugador con la puntuacion mas alta es: " + jugadorGanador);
    }

 	public static double metodoPromedio(double puntTotal, int cantidadRondas) {
		double resultado = (puntTotal / cantidadRondas);
        return resultado;
    }

	public static int puntuacionAlta(int[] jugadores) {
		int mayor = 0;
		int jugadorGanador = 1; 
		for(int i = 0; i < jugadores.length; i++) {
			if(jugadores[i] > mayor) {
				mayor = jugadores[i];
				jugadorGanador = i + 1; 
			}
		}
		return jugadorGanador;
	}


	
}