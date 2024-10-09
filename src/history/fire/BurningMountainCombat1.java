package history.fire;

import character.Player;

import java.util.Scanner;

/**
 * La clase MountainPathCombat maneja la narrativa y el combate para el Camino 1 en la Montaña Ardiente.
 * El jugador enfrenta un combate al avanzar hacia la cima.
 */
public class BurningMountainCombat1 {
    private Scanner scanner;
    private Player player;

    public BurningMountainCombat1(Scanner scanner, Player player) {
        this.scanner = scanner;
        this.player = player;
    }

    /**
     * Inicia la narrativa y llama al método de combate.
     */
    public void startPathAndCombat() {
        System.out.println("El enemigo emerge de entre las rocas ardientes, con su cuerpo envuelto en llamas.");
        System.out.println("Sus ojos brillan con una furia salvaje mientras se prepara para atacar.");
        System.out.println("Sabes que no podrás evitarlo. Esto será una batalla de fuerza y resistencia.");

        startCombat();
    }

    /**
     * Método que llama a la lógica de combate.
     * Este método será completado con la lógica que está implementando tu compañero.
     */
    private void startCombat() {
        System.out.println("El combate comienza...");
    }
}
