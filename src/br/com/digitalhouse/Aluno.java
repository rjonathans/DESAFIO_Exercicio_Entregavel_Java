package br.com.digitalhouse;

public class Aluno {

    //Attributes
    private String nome;
    private String sobrenome;
    private Integer codDeAluno;

    //Constructor
    public Aluno(String nome, String sobrenome, Integer codDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codDeAluno = codDeAluno;
    }

    //Empty Constructor
    public Aluno() {
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

    public Integer getCodDeAluno() {
        return codDeAluno;
    }

    public void setCodDeAluno(Integer codDeAluno) {
        this.codDeAluno = codDeAluno;
    }

    @Override
    public String toString() {
        return "\n>>ALUNO" +
                "\nNome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nCodDeAluno: " + codDeAluno + "\n";
    }

}
