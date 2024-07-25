package One.digitalInnovation.gof.Singleton;

/**
 * singleton(Apressado)
 *
 * @autor RafaSantos
 */
public class singletonEager {

    private static singletonEager instancia = new singletonEager();

    private singletonEager() {
        super();
    }

    public static singletonEager getInstance() {
        return instancia;
    }

}
