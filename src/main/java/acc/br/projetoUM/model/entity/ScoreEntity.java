package acc.br.projetoUM.model.entity;

import acc.br.projetoUM.model.dto.ScoreDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "SCORE")
public class ScoreEntity {

    @Id
    private Integer id;

    private Integer vitorias;

    private Integer derrotas;

    private Integer empates;

    public ScoreEntity() {
    }

    public ScoreEntity(Integer vitorias, Integer derrotas, Integer empates) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public static ScoreEntity fromDto(ScoreDto dto) {
        ScoreEntity scoreEntity = new ScoreEntity();
        scoreEntity.setId(dto.getId());
        scoreEntity.setVitorias(dto.getVitorias());
        scoreEntity.setDerrotas(dto.getDerrotas());
        scoreEntity.setEmpates(dto.getEmpates());
        return scoreEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
}
