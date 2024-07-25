package One.digitalInnovation.gof.Strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.Mover();
        robo.Mover();

        robo.setComportamento(defensivo);
        robo.Mover();
        System.out.println("andou pra tras");

        robo.setComportamento(agressivo);
        robo.Mover();
        robo.Mover();
        robo.Mover();

    }
}
