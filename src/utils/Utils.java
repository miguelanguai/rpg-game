package utils;

public class Utils {

    /**
     * de momento este codigo no funciona
     */
    public static void clearTerminal(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
