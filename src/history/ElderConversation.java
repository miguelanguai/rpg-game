package history;

import character.Player;
import history.introduction.IntroductionPart2;

import java.util.Scanner;

/**
 * La clase History.ElderConversation maneja el diálogo entre el jugador y el anciano.
 */
public class ElderConversation {
    private Player player;

    public ElderConversation(Player player) {
        this.player = player;
    }

    /**
     * Inicia el diálogo con el anciano.
     */
    public void start() {
        System.out.println("Anciano: 'Así que has llegado, "+player.getName()+"... aunque, no sé si este es el momento adecuado para celebrar tu llegada.'");
        System.out.println("Anciano: Este lugar que ves, esta isla... es mucho más de lo que parece.");
        System.out.println("Anciano: La Isla de Java ha sido el corazón de los elementos durante siglos.");
        System.out.println("Anciano: Aquí, tierra, fuego, agua y aire se entrelazan, mantenidos en equilibrio por los antiguos guardianes.");
        System.out.println("Anciano: Pero algo ha cambiado... algo terrible ha sucedido.");
    }

    /**
     * Muestra las opciones de diálogo disponibles para el jugador.
     */
    public void displayOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opciones:");
        System.out.println("1. ¿Quién eres tú?");
        System.out.println("2. ¿Qué es lo que ha sucedido?");
        System.out.println("3. ¿Qué tiene que ver todo esto conmigo?");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                respondToWhoAreYou();
                break;
            case 2:
                
                respondToWhatHappened();
                break;
            case 3:
                respondToWhatDoesItMatter();
                break;
            default:
                System.out.println("Opción no válida.");
                displayOptions();
        }
    }

    /**
     * Responde a la pregunta "¿Quién eres tú?".
     */
    private void respondToWhoAreYou() {
        System.out.println("Anciano: Mi nombre... ya no importa. Una vez fui conocido como el Erudito de Jakarta, un guardián de conocimientos y secretos ancestrales.");
        System.out.println("Anciano: Pero esos días quedaron atrás. Ahora soy solo un viejo que ha visto demasiado, y teme lo que está por venir.");
    }

    /**
     * Responde a la pregunta "¿Qué es lo que ha sucedido?".
     */
    private void respondToWhatHappened() {
        System.out.println("Anciano: El Rey Ardán, el líder de los Guardianes Elementales, ha desaparecido.");
        System.out.println("Anciano: Con él, el equilibrio que ha mantenido la isla en paz por generaciones comienza a desmoronarse.");
        System.out.println("Anciano: Los elementos, antes en armonía, están en caos.");
        System.out.println("Anciano: La tierra tiembla, el fuego arde sin control, el agua inunda sin piedad y los vientos rugen con furia.");
        System.out.println("Sin Ardán, la isla está condenada.");
    }

    /**
     * Responde a la pregunta "¿Qué tiene que ver todo esto conmigo?".
     */
    private void respondToWhatDoesItMatter() {
        System.out.println("Anciano: Tú, " + player.getName() +" has sido elegido. Las leyendas hablaban de la llegada de un héroe cuando las sombras cayeran sobre la isla.");
        System.out.println("Anciano: Alguien con la fuerza, la destreza y el coraje para desafiar a los elementos, y restaurar lo que se ha perdido.");
        System.out.println("Anciano: Tu destino está entrelazado con el de esta isla. Si no actúas, Java caerá en la oscuridad para siempre");
    }


}
