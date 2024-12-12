package acc.br.projetoUM.model.dto;

import acc.br.projetoUM.model.entity.ScoreEntity;

public class ScoreDto {

    private Integer id;

    private Integer vitorias;

    private Integer derrotas;

    private Integer empates;
    
    public ScoreDto() {
    }

    public ScoreDto(Integer id, Integer vitorias, Integer derrotas, Integer empates) {
        this.id = id;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public static ScoreDto fromEntity(ScoreEntity entity) {
        ScoreDto scoreDto = new ScoreDto();
        scoreDto.setId(entity.getId());
        scoreDto.setVitorias(entity.getVitorias());
        scoreDto.setDerrotas(entity.getDerrotas());
        scoreDto.setEmpates(entity.getEmpates());
        return scoreDto;
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
