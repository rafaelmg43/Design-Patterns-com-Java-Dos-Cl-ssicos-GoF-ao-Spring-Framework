package One.digitalInnovation.gof.Singleton;

public class test {

    public static void main(String[] args) {
        singletonLazy Lazy =  singletonLazy.getInstance();
        singletonEager Eager = singletonEager.getInstance();
        singletonLazyHolder LazyHolder = singletonLazyHolder.getInstance();

        //Teste Realacionados ao design Singleton
        System.out.println(Lazy);
        Lazy = singletonLazy.getInstance();
        System.out.println(Lazy);

        System.out.println(Eager);
        Lazy = singletonLazy.getInstance();
        System.out.println(Eager);

        System.out.println(LazyHolder);
        Lazy = singletonLazy.getInstance();
        System.out.println(LazyHolder);
    }
}
