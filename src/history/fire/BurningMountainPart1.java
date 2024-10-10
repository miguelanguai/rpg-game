package history.fire;

import character.Player;

import java.util.Scanner;

/**
 * La clase FireMountainPart1 maneja la primera parte de la ruta de la Montaña Ardiente.
 * Aquí el jugador comienza su travesía a través del fuego y lava.
 */
public class BurningMountainPart1 {
    private Scanner scanner;
    private Player player;

    public BurningMountainPart1(Scanner scanner, Player player) {
        this.scanner = scanner;
        this.player = player;
    }

    /**
     * Inicia la primera parte de la travesía por la Montaña Ardiente.
     */
    public void startBurningMountain() {
        System.out.println("Te encuentras al pie de la Montaña Ardiente. El calor abrasador te envuelve.");
        System.out.println("Las llamas rugen desde las profundidades de la montaña, y la lava fluye lentamente como si fuera sangre de la tierra misma.");
        System.out.println("Anciano (voz lejana): 'Has elegido la Ruta del Fuego, joven " + player.getName() + ". Aquí enfrentarás el poder del calor y la destrucción. Solo aquellos con corazón fuerte sobreviven.'");
        System.out.println("El aire es denso y el suelo está marcado por grietas ardientes que emiten calor intenso.");
        System.out.println("Frente a ti, un camino sinuoso se abre, subiendo hacia lo que parece un cráter gigante en la cima.");
        System.out.println("Tienes dos opciones:");
        System.out.println("1. Avanzar con valentía hacia la cima, a pesar del peligro evidente.");
        System.out.println("2. Buscar un atajo más seguro, aunque podría ser más largo.");

        makeChoice();
    }

    /**
     * Permite al jugador tomar una decisión sobre cómo proceder en la Montaña Ardiente.
     */
    private void makeChoice() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Avanzas con decisión hacia la cima. El calor se intensifica, y tus pasos se vuelven más pesados.");
                BurningMountainCombat1 burningMountainCombat1 = new BurningMountainCombat1(scanner, player);
                burningMountainCombat1.startPathAndCombat();
                break;
            case 2:
                System.out.println("Decides buscar un atajo. Te deslizas por un pasaje lateral, donde el calor es menos intenso, pero el camino es traicionero.");
                // Agregar lógica para el atajo y sus desafíos.
                break;
            default:
                System.out.println("Opción no válida. Elige sabiamente.");
                makeChoice(); // Llama de nuevo si la opción es inválida
        }
    }
}
