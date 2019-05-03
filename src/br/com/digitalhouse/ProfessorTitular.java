package br.com.digitalhouse;

public class ProfessorTitular extends Professor{
    //Attributes

    private String especialidade;

    //Constructor
    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codDeProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codDeProfessor);
        this.especialidade = especialidade;
    }

    //Methods
    //getters and setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}
