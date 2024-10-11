package history.fire;

import java.util.Scanner;

import history.GameOver;
import object.ObjectEntity;
import object.ObjectAttribute;
import battle.Battle;
import character.Enemy;
import character.Player;

/**
 * La clase MountainPathCombat maneja la narrativa y el combate para el Camino 1 en la Montaña Ardiente.
 * El jugador enfrenta un combate al avanzar hacia la cima.
 */
public class BurningMountainCombat1 {
    private Player player;

    public BurningMountainCombat1(Player player) {
        this.player=player;
    }

    /**
     * Inicia la narrativa y ejecuta startCombat()
     */
    public void startPathAndCombat() {
        System.out.println("El enemigo emerge de entre las rocas ardientes, con su cuerpo envuelto en llamas.");
        System.out.println("Sus ojos brillan con una furia salvaje mientras se prepara para atacar.");
        System.out.println("Sabes que no podrás evitarlo. Esto será una batalla de fuerza y resistencia.");

        startCombat();
    }

    /**
     * genera las estadísticas del combate
     */
    private void startCombat() {
        boolean isBoss = false;
        ObjectEntity enemyObject = new ObjectEntity("Cristal de confusión", "Un pequeño cristal que emite un brillo tenue. Al activarse, genera ilusiones en el entorno, confundiendo a los jugadores y haciéndolos dudar de sus decisiones.", ObjectAttribute.STATUS);
        int playerLevel = player.getLevel();
        String enemyName = "Salamandra de fuego";
        Enemy enemy = Enemy.generateEnemy(isBoss, enemyObject, playerLevel, enemyName);

        Battle battle = new Battle(player, enemy);
        boolean playerWon=battle.battle();
        // Aquí puedes continuar la historia dependiendo del resultado de la batalla
        System.out.println("playerWon: "+playerWon);
        if (playerWon) {
            // Continuar la historia
            BurningMountainPart2.main(player);
        } else {
            GameOver gameOver = new GameOver();
            gameOver.endGame(player.getName(), "Has muerto en combate");
        }
    }
}

