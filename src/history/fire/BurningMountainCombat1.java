package history.fire;

import battle.Battle;
import character.Player;
import character.Enemy;  // Asegúrate de importar la clase Enemy
import object.ObjectAttribute;
import object.ObjectEntity;  // Asegúrate de que esta clase está disponible

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
     */
    private void startCombat() {

        ObjectEntity object = new ObjectEntity("Salamandras","Correnmucho", ObjectAttribute.ATTACK); // Asegúrate de inicializar correctamente este objeto


        Enemy enemy = new Enemy(object);
        System.out.println(player);
        System.out.println(player.getTotalHealth());
        Battle battle = new Battle(player, enemy, false); // Asegúrate de que Battle acepta Enemy
        battle.battle();

        // Aquí puedes continuar la historia dependiendo del resultado de la batalla
        if (battle.isPlayerWon()) {
            System.out.println("¡Has derrotado al enemigo y continúas tu camino!");
            // Continuar la historia
        } else {
            System.out.println("Has sido derrotado. Debes regresar y prepararte mejor.");
            // Lógica adicional para el caso de derrota
        }
    }
}
