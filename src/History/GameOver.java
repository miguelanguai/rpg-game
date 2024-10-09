package History;

/**
 * La clase GameOver maneja el final del juego.
 */
public class GameOver {

    /**
     * Muestra el mensaje de finalización del juego.
     * @param reason para poder mostrar mensajes personalizados en distintas situaciones del juego
     */
    public void endGame(String playerName, String reason) {
        System.out.println("Has " + reason + " por la isla de Java y a su destino incierto.");
        System.out.println("Mientras caminas hacia la orilla, sientes el peso de la elección en tus hombros.");
        System.out.println("Las sombras avanzan, inexorables. Los Heraldos de las Sombras se liberan de su prisión bajo Jakarta, y el caos se extiende, consumiendo todo a su paso.");
        System.out.println("El destino de Java quedó sellado en oscuridad. Las fuerzas del mal han triunfado. Fin del juego.");
    }
}
