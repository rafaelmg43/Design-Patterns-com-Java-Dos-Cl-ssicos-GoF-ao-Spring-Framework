package One.digitalInnovation.gof.subsistema2.Cep;

public class cepApi {

    private static cepApi instancia = new cepApi();

    private cepApi() {

        super();
    }

    public static cepApi getInstance() {

        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    public String recuperarEstado(String cep){
        return "Sp";
    }

}

