package One.digitalInnovation.gof.Strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se Normalmente...");
        System.out.println("Movendo-se 1 passo pra frente");
    }
}
