package history;

import character.Player;
import history.fire.BurningMountainPart1;
import history.introduction.Introduction;
import history.introduction.IntroductionPart2;
import history.introduction.IntroductionPart3;

import java.util.Scanner;

/**
 * La clase History.Game representa la lógica principal del juego donde el jugador interactúa
 * con un anciano y toma decisiones que afectarán el desarrollo del juego.
 */
public class Game {
    private Player player;
    private Introduction introduction;
    private ElderConversation elderConversation;

    /**
     * Inicializa el juego y crea instancias de Player, History.Introduction y History.ElderConversation.
     */
    public Game() {
        player = Player.generatePlayer();
        introduction = new Introduction();
        elderConversation = new ElderConversation(player);
    }

    /**
     * Inicia el juego mostrando la introducción y el diálogo con el anciano.
     */
    public void start() {
        introduction.display();
        elderConversation.start();
        elderConversation.displayOptions();
        IntroductionPart2 i2 = new IntroductionPart2(player);
        i2.introductionPart2();
        IntroductionPart3 introductionPart3 = new IntroductionPart3(player);
        introductionPart3.introductionPart3();
    }

}
