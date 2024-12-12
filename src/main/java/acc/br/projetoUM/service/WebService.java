package acc.br.projetoUM.service;

import org.springframework.stereotype.Service;

@Service
public class WebService {

    public String jogar(String aEscolha) {

        String saida = "empate";

        if (aEscolha.equalsIgnoreCase("papel")) {
            saida = "ganhou";
        }
        if (aEscolha.equalsIgnoreCase("tesoura")) {
            saida = "perdeu";
        }
        return saida;
    }
}
