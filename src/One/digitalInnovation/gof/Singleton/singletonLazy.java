package One.digitalInnovation.gof.Singleton;

/**
 * singleton(Preguiçoso)
 *
 * @autor RafaSantos
 */
public class singletonLazy {
    private static singletonLazy instancia;
    private singletonLazy(){
        super();
    }

    public static singletonLazy getInstance(){
        if (instancia == null){
            instancia = new singletonLazy();
        }
        return instancia;
    }

}
