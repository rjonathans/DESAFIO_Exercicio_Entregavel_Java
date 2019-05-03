package br.com.digitalhouse;

public class Curso {
    //Attributes
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer qtdMaximaAlunos;

    //Constructor
    public Curso(String nome, Integer codCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer qtdMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    //Empty Constructor
    public Curso() {
    }

    //Methods
    public boolean adicionarUmAluno();{

    }
    public void excluirAluno();{

    }

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodCurso() {
        return codigoCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codigoCurso = codCurso;
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

    //To String
    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codCurso=" + codigoCurso +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", qtdMaximaAlunos=" + qtdMaximaAlunos +
                '}';
    }
}
