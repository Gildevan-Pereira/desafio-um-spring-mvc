package acc.br.projetoUM.service;

import acc.br.projetoUM.model.dto.ScoreDto;
import acc.br.projetoUM.model.entity.ScoreEntity;
import acc.br.projetoUM.repository.ScoreRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    public ScoreDto findById() {
        ScoreDto scoreDto;
        try {
            scoreDto = ScoreDto.fromEntity(scoreRepository.findById(1).get());
        } catch (Exception e) {
            ScoreEntity scoreEntity;
            scoreEntity = new ScoreEntity(0, 0, 0);
            var entitySaved = scoreRepository.save(scoreEntity);
            scoreDto = ScoreDto.fromEntity(entitySaved);
        }
        return scoreDto;
    }

    public void salvarScore(String escolha, ScoreDto score) {

        switch (escolha.trim().toLowerCase()) {
            case "papel":
                var increment1 = score.getVitorias() != null ? score.getVitorias() + 1 : 1;
                score.setVitorias(increment1);
                break;
            case "tesoura":
                var increment2 = score.getDerrotas() != null ? score.getDerrotas() + 1 : 1;
                score.setDerrotas(increment2);
                break;
            default:
                var increment3 = score.getEmpates() != null ? score.getEmpates() + 1 : 1;
                score.setEmpates(increment3);
                break;
        }
        scoreRepository.save(ScoreEntity.fromDto(score));
    }

    public ScoreDto zerarScore() {
        ScoreDto scoreDto;

        scoreDto = ScoreDto.fromEntity(scoreRepository.findById(1).orElseThrow());

        var scoreEntity = new ScoreEntity(0, 0, 0);
        scoreEntity.setId(scoreDto.getId());

        var entitySaved = scoreRepository.save(scoreEntity);

        return ScoreDto.fromEntity(entitySaved);
    }
}
