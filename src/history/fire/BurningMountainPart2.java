package history.fire;

import battle.Battle;
import character.Enemy;
import character.Player;
import history.GameOver;
import object.ObjectAttribute;
import object.ObjectEntity;

public class BurningMountainPart2 {

    Player player;

    public BurningMountainPart2(Player player) {
        this.player = player;
    }

    public static void dialogue(){
        System.out.println("Bla bla");
    }

    public static void main(Player player){
        dialogue();
        ObjectEntity enemyObject = new ObjectEntity("Rubi llameante", "Una gema que acredita que has vencido", ObjectAttribute.STATUS);
        int playerLevel = player.getLevel();
        String enemyName = "Serpentucho infernal";
        Enemy enemy = Enemy.generateEnemy(true, enemyObject, playerLevel, enemyName);

        Battle battle = new Battle(player, enemy);

        boolean playerWon =battle.battle();
        if(playerWon){
        System.out.println("Has triunfado, pero las fuerzas oscuras aún se retuercen en las profundidades");
            System.out.println("De vuelta en la aldea, el anciano lo recibe con orgullo.");
            System.out.println("Anciano: Lo has logrado. El mundo está a salvo, por ahora. Pero recuerda... siempre habrá sombras al acecho. Mantén la llama viva.");
        }else{
            GameOver gameOver = new GameOver();
            gameOver.endGame(player.getName(), "Has perdido a las puertas de la gloria. Intentaloo de nuevo");
        }
    }
}
