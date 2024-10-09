/**
 * La clase Game representa la lógica principal del juego donde el jugador interactúa
 * con un anciano y toma decisiones que afectarán el desarrollo del juego.
 */
public class Game {
    private MockPlayer player;
    private Introduction introduction;
    private ElderConversation elderConversation;

    /**
     * Inicializa el juego y crea instancias de Player, Introduction y ElderConversation.
     */
    public Game() {
        player = new MockPlayer();
        introduction = new Introduction();
        elderConversation = new ElderConversation();
    }

    /**
     * Inicia el juego mostrando la introducción y el diálogo con el anciano.
     */
    public void start() {
        introduction.display();
        elderConversation.start();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
