package history.introduction;

import character.Player;
import history.GameOver;

import java.util.Scanner;

/**
 * La clase IntroductionPart2 maneja la continuación de la historia
 * tras la conversación inicial con el anciano.
 */
public class IntroductionPart2 {
    private Player player;
    private GameOver gameOver;

    public IntroductionPart2(Player player) {
        this.player = player;
        this.gameOver = new GameOver();
    }

    // Método que inicia la continuación de la historia
    public void introductionPart2() {
        System.out.println("Anciano: Los Guardianes Elementales han perdido su camino.");
        System.out.println("Anciano: Ellos protegen los cristales que mantienen el control sobre los elementos, pero sin el Rey Ardán, sus corazones están llenos de caos y rabia.");
        System.out.println("Anciano: Solo al recuperar los Cristales Elementales, podrás restaurar el equilibrio y salvar la isla.");
        System.out.println("Anciano: Pero... hay más. Los Heraldos de las Sombras, seres que se alimentan del caos, han comenzado a moverse");
        System.out.println("Anciano: Ellos fueron sellados hace siglos bajo la ciudad de Jakarta, pero ahora que el equilibrio se ha roto, buscan liberarse.");
        System.out.println("Anciano: Si lo logran, la isla, y todo lo que la rodea, será destruida");
        System.out.println("Anciano: Debes ser rápido, valiente, y sobre todo, estar preparado para lo que está por venir. Tu viaje no será fácil, pero en tus manos está el destino de Java.");
        System.out.println("Anciano: Ahora, la decisión es tuya, joven " + player.getName());
        System.out.println("Anciano: Puedes elegir seguir adelante y enfrentar el destino que te espera, o puedes volver por donde viniste, dejando que las sombras consuman este mundo.");
        if (finalDecision()){
            this.acceptMission();
        }else{
            this.rejectMission();
        }
    }

    /**
     * Permite al jugador tomar una decisión final sobre aceptar o rechazar la misión del anciano.
     */
    private boolean finalDecision() {
        System.out.println("Anciano: Sea cual sea tu elección, debes tomarla ahora.");
        System.out.println("1. Acepto la misión. Ayudaré a restaurar el equilibrio.");
        System.out.println("2. No. Esta no es mi lucha.");

        Scanner scanner = new Scanner(System.in);
        boolean decission=true;
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice==1){
            decission=true;
        }else if(choice==2){
            decission=false;
        }else{
            finalDecision();
        }
        return decission;
    }

    /**
     * Maneja la aceptación de la misión.
     */
    private void acceptMission() {
        System.out.println("Anciano: '¡Excelente! Juntos restauraremos el equilibrio de la isla.'");


    }

    /**
     * Maneja el rechazo de la misión.
     */
    private void rejectMission() {
        gameOver.endGame(player.getName(), "rechazado poner tu vida en juego");
    }
}
