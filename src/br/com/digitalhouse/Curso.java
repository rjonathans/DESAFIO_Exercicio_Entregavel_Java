package br.com.digitalhouse;

import java.util.List;

public class Curso {
    //Attributes
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer qtdMaximaAlunos;
    private List<Aluno> alunos;

    //Constructor


    public Curso() {
    }

    public Curso(String nome, Integer codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer qtdMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    //Methods
    public void adicionarUmAluno(Aluno aluno) {
        if (alunos.contains(aluno)){
            System.out.println("Este aluno já foi cadastrado!");
        } else {
            this.alunos.add(aluno);
            System.out.println("Aluno "+aluno+" cadastrado com sucesso!");
        }
        this.alunos.add(aluno);

    }

    public void excluirAluno(Aluno aluno) {
        {
            if (alunos.contains(aluno)){
                System.out.println("Este aluno já foi cadastrado!");
            } else {
                this.alunos.remove(aluno);
                System.out.println("Aluno "+aluno+" cadastrado com sucesso!");
            }

        }
    }

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQtdMaximaAlunos() {
        return qtdMaximaAlunos;
    }

    public void setQtdMaximaAlunos(Integer qtdMaximaAlunos) {
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    //To String
    @Override
    public String toString() {
        return ">>CURSO: " + nome +
                "\nCodigo do Curso: " + codigoCurso + "\n" +
                "\n>>PROFESSOR TITULAR " + professorTitular + "\n" +
                "\n>>PROFESSOR ADJUNTO " + professorAdjunto + "\n" +
                "\n>>QTD. Máxima Alunos: " + qtdMaximaAlunos + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codigoCurso == null) {
            if (other.codigoCurso != null)
                return false;
        } else if (!codigoCurso.equals(other.codigoCurso))
            return false;
        return true;
    }

}
