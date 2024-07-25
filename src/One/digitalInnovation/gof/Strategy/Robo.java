package One.digitalInnovation.gof.Strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void Mover(){
        comportamento.mover();
    }
}
