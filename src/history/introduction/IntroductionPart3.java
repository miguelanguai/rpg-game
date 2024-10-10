package history.introduction;

import character.Player;
import history.fire.BurningMountainPart1;

import java.util.Scanner;

/**
 * La clase IntroductionPart3 maneja la continuación de la historia
 * después de que el jugador acepta la misión del anciano.
 */
public class IntroductionPart3 {
    private Scanner scanner;
    private Player player;

    public IntroductionPart3(Scanner scanner, Player player) {
        this.scanner = scanner;
        this.player = player;
    }

    /**
     * Método que inicia la continuación de la historia.
     */
    public void introductionPart3() {
        System.out.println("Anciano: Sabía que la leyenda no se equivocaba. No será fácil, pero tu valentía es el primer paso hacia la salvación. La isla te necesita, y tú serás quien desate el poder de los Cristales Elementales.");
        System.out.println("El anciano extiende su mano hacia ti, y en ese momento, cuatro caminos se abren ante ti, cada uno representando una de las fuerzas elementales que rigen Java.");
        System.out.println("Anciano: Antes de continuar, debes escoger tu camino inicial. Cada ruta representa un desafío distinto, y el equilibrio solo será restaurado cuando completes los cuatro. Elige sabiamente, pues cada ruta pondrá a prueba tus habilidades de formas diferentes.");

        // Llamar a la opción de elegir ruta
        choosePath();
    }

    /**
     * Permite al jugador elegir un camino inicial.
     */
    private void choosePath() {
        System.out.println("Opciones de ruta:");
        System.out.println("1. Montaña Ardiente (Ruta del Fuego)");
        System.out.println("2. Bosque Antiguo (Ruta de la Tierra)");
        System.out.println("3. Acantilados del Viento (Ruta del Aire)");
        System.out.println("4. El Lago Eterno (Ruta del Agua)");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Anciano: La Montaña Ardiente no es lugar para los débiles.");
                System.out.println("Anciano: Antaño un hogar de poderosos espíritus del fuego, ahora está corrompida por fuerzas oscuras.");
                System.out.println("Anciano: Prepárate para enfrentar enemigos que controlan el fuego, y tal vez algo peor.");
                BurningMountainPart1 burningMountainPart1 = new BurningMountainPart1(scanner, player);
                burningMountainPart1.startBurningMountain();
                break;
            case 2:
                System.out.println("Has elegido el Bosque Antiguo. Prepárate para enfrentar los desafíos de la tierra.");
                // TO-DO: lógica para la ruta de la tierra.
                break;
            case 3:
                System.out.println("Has elegido los Acantilados del Viento. Prepárate para enfrentar los desafíos del aire.");
                // TO-DO: la lógica para la ruta del aire.
                break;
            case 4:
                System.out.println("Has elegido El Lago Eterno. Prepárate para enfrentar los desafíos del agua.");
                // TO-DO:  lógica para la ruta del agua.
                break;
            default:
                System.out.println("Opción no válida. Elige una ruta válida.");
                choosePath();
        }
    }
}
