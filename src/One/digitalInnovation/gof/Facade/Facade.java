package One.digitalInnovation.gof.Facade;

import One.digitalInnovation.gof.subsistema1.crm.CrmService;
import One.digitalInnovation.gof.subsistema2.Cep.cepApi;

public class Facade {
    void migrarClient(String nome, String cep){

        String cidade = cepApi.getInstance().recuperarCidade(cep);
        String estado = cepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarClient(nome,cep,estado,cidade);
    }
}
