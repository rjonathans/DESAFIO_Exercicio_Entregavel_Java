package br.com.digitalhouse;

public class Professor {
    //Attributes
    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codDeProfessor;

    //Constructor
    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codDeProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codDeProfessor = codDeProfessor;
    }

    //Empty Constructor
    public Professor() {
    }

    //Methods
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodDeProfessor() {
        return codDeProfessor;
    }

    public void setCodDeProfessor(Integer codDeProfessor) {
        this.codDeProfessor = codDeProfessor;
    }

    //toString
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", tempoDeCasa=" + tempoDeCasa +
                ", codDeProfessor=" + codDeProfessor +
                '}';
    }
}
