package One.digitalInnovation.gof.subsistema1.crm;

public class CrmService {

    public CrmService() {
        super();
    }

    public static void gravarClient(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema de crm");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
