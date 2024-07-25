package One.digitalInnovation.gof.Singleton;

/**
 * singleton(LazerHolder)
 *
 * @autor RafaSantos
 */
public class singletonLazyHolder {

    private static class instanceHolder {
    public static singletonLazyHolder instancia = new singletonLazyHolder();
    }

    private singletonLazyHolder() {

        super();
    }

    public static singletonLazyHolder getInstance() {

        return instanceHolder.instancia;
    }

}
