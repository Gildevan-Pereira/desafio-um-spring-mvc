package acc.br.projetoUM.controller;

import acc.br.projetoUM.model.dto.ScoreDto;
import acc.br.projetoUM.service.ScoreService;
import acc.br.projetoUM.service.WebService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    private final WebService webService;
    private final ScoreService scoreService;

    public WebController(WebService webService, ScoreService scoreService) {
        this.webService = webService;
        this.scoreService = scoreService;
    }

    @GetMapping("/jogar")
    public String play(@RequestParam(name="escolha") String aEscolha, Model model){

        var saida = webService.jogar(aEscolha);

        ScoreDto score = scoreService.findById();

        scoreService.salvarScore(aEscolha, score);

        model.addAttribute("saida", saida);
        model.addAttribute("aEscolha", aEscolha);
        model.addAttribute("score", score);

        return "resultado";
    }


    @GetMapping("/zerar")
    public String zerarScore(Model model) {
        var score = scoreService.zerarScore();
        model.addAttribute("score", score);
        return "resultado";
    }

    @ResponseBody
    @GetMapping("/score")
    public ScoreDto getScore() {
        return scoreService.findById();
    }
}

