package DiaCuatro;

import java.util.Scanner;

public class Nimdemo {



        private Nim[] nims;
        private Jugador[] jugadores;
        private int jugadorActual;
        private Scanner scanner;

        public Nimdemo(String nombreJugador1, String nombreJugador2) {
            nims= new Nim[]{new Nim(3), new Nim(3), new Nim(3)};
            jugadores = new Jugador[]{new Jugador(nombreJugador1), new Jugador(nombreJugador2)};
            jugadorActual = 0;
            scanner = new Scanner(System.in);
        }

        public void imprimirNims() {
            for (int i = 0; i < nims.length; i++) {
                System.out.println("Nim " + (i + 1) + ": " + nims[i].getCantidad());
            }
        }

        public void realizarMovimiento() {

            System.out.print(jugadores[jugadorActual].getNombre() + ", elige una pila (1, 2 o 3): ");
            int pila = scanner.nextInt();
            System.out.print("Elige la cantidad de contadores a quitar: ");
            int cantidad = scanner.nextInt();

            // Validar la entrada del jugador
            if (pila >= 1 && pila <= 3 && cantidad >= 1 && cantidad <= nims[pila - 1].getCantidad()) {
                nims[pila - 1].quitarContadores(cantidad);
            } else {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            }
        }

        public boolean juegoTerminado() {
            return nims[0].getCantidad() == 0 && nims[1].getCantidad() == 0 && nims[2].getCantidad() == 0;
        }

        public void cambiarTurno() {
            // Cambiar al siguiente jugador
            jugadorActual = 1 - jugadorActual;  // Alternar entre 0 y 1
        }

        public void jugar() {
            while (!juegoTerminado()) {
                imprimirNims();
                realizarMovimiento();
                cambiarTurno();
            }

            System.out.println(jugadores[jugadorActual].getNombre() + " ha quitado el último contador. ¡Ganador!");
            scanner.close();
        }

        public static void main(String[] args) {
            Nimdemo juego = new Nimdemo("Jugador1", "Jugador2");
            juego.jugar();
        }
    }













