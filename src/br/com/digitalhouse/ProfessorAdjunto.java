package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {

    //Attributes
    private Integer horasMonitoria;

    //Constructor
    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codDeProfessor, Integer horasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codDeProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    //Empty constructor
    public ProfessorAdjunto() {
    }

    //methods
    //getters and setters
    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }

    //to String
    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "horasMonitoria=" + horasMonitoria +
                '}';
    }
}
