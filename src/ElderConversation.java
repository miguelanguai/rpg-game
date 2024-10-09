import java.util.Scanner;

/**
 * La clase ElderConversation maneja el diálogo entre el jugador y el anciano.
 */
public class ElderConversation {
    /**
     * Inicia el diálogo con el anciano.
     */
    public void start() {
        System.out.println("Anciano: 'Así que has llegado, joven aventurero... aunque, no sé si este es el momento adecuado para celebrar tu llegada.'");
        displayOptions();
    }

    /**
     * Muestra las opciones de diálogo disponibles para el jugador.
     */
    private void displayOptions() {
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
                displayOptions(); // Vuelve a llamar a las opciones si la opción es inválida
        }

        finalDecision();
    }

    /**
     * Responde a la pregunta "¿Quién eres tú?".
     */
    private void respondToWhoAreYou() {
        System.out.println("Anciano: 'Soy el guardián de esta isla, y he estado esperando tu llegada.'");
    }

    /**
     * Responde a la pregunta "¿Qué es lo que ha sucedido?".
     */
    private void respondToWhatHappened() {
        System.out.println("Anciano: 'La isla está en peligro, y solo tú puedes ayudar a restaurar el equilibrio.'");
    }

    /**
     * Responde a la pregunta "¿Qué tiene que ver todo esto conmigo?".
     */
    private void respondToWhatDoesItMatter() {
        System.out.println("Anciano: 'Porque está en tus manos cambiar el destino de todos los que aquí habitan.'");
    }

    /**
     * Permite al jugador tomar una decisión final sobre aceptar o rechazar la misión del anciano.
     */
    private void finalDecision() {
        System.out.println("Ahora, la decisión es tuya:");
        System.out.println("1. Acepto la misión. Ayudaré a restaurar el equilibrio.");
        System.out.println("2. No. Esta no es mi lucha.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                acceptMission();
                break;
            case 2:
                rejectMission();
                break;
            default:
                System.out.println("Opción no válida.");
                finalDecision(); // Vuelve a llamar a la decisión final si la opción es inválida
        }
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
        System.out.println("Anciano: 'Entiendo, pero recuerda que el destino de la isla está en tus manos.'");
    }
}
