/**
 * La clase MockPlayer simula el comportamiento de un jugador en el juego.
 * Se utiliza para propósitos de prueba.
 */
public class MockPlayer {
    private String name;

    /**
     * Inicializa un MockPlayer con un nombre predeterminado.
     */
    public MockPlayer() {
        this.name = "Jugador Simulado";
    }

    /**
     * Devuelve el nombre del jugador simulado.
     *
     * @return El nombre del jugador.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para simular una acción del jugador.
     * Este método puede ser modificado según la lógica de prueba que necesites.
     */
    public void performAction() {
        System.out.println(name + " está realizando una acción simulada.");
    }
}
