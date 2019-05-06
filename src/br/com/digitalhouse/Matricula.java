package br.com.digitalhouse;

import java.util.Currency;
import java.util.Date;

public class Matricula {
    //Attributtes
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;

    //Constructor
        public Matricula(Aluno aluno, Curso curso, Date dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    //Empty Constructor
    public Matricula() {
    }

    //Methods
    //Getters and setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    //To String
    @Override
    public String toString() {
        return "\n>>MATRICULA" +
                "\naluno: " + aluno +
                "\nCurso: " + curso +
                "\nDataMatricula: " + dataMatricula;
    }
}
