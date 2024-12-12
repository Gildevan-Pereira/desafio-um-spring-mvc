package acc.br.projetoUM.repository;

import acc.br.projetoUM.model.entity.ScoreEntity;
import org.springframework.data.repository.CrudRepository;

public interface ScoreRepository extends CrudRepository<ScoreEntity, Integer> {
}
