package history.fire;

import battle.Battle;
import character.CharacterType;
import character.Player;
import character.Enemy;
import character.attributes.Attack;
import object.ObjectAttribute;
import object.ObjectEntity;

import java.util.ArrayList;
import java.util.List;
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

       boolean isBoss = false;
       ObjectEntity enemyObject = new ObjectEntity("Cristal de confusión", "Un pequeño cristal que emite un brillo tenue. Al activarse, genera ilusiones en el entorno, confundiendo a los jugadores y haciéndolos dudar de sus decisiones.", ObjectAttribute.STATUS);
       int playerLevel = player.getLevel();
       String enemyName = "Salamandra de fuego";

       Enemy enemy = Enemy.generateEnemy(isBoss, enemyObject, playerLevel, enemyName);



        System.out.println(player);
        System.out.println(player.getTotalHealth());
        Battle battle = new Battle(player, enemy, false);
        battle.battle();


        if (battle.isPlayerWon()) {
            System.out.println("¡Has derrotado al enemigo y continúas tu camino!");

        } else {
            System.out.println("Has sido derrotado. Debes regresar y prepararte mejor.");

        }
    }
}
