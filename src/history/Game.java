package history;

import character.Player;
import history.introduction.Introduction;

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
    }

}
