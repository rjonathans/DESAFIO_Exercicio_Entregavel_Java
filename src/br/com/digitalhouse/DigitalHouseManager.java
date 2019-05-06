package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    //Attributes
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

        //Methods
    public void registrarCurso(Curso curso) {
        this.getCursos().add(curso);
        System.out.println("REGISTRANDO....\n" + curso + "\nCURSO REGISTRADO COM SUCESSO.\n"+"\n*****************\n");
    }

    public void excluirCurso(Integer codigoCurso) {

    }

    public void consultarCurso(Integer codigoAluno) {

    }

    public void registrarProfessorTitular(Professor professores) {
        this.professores.add(professores);
        System.out.print("\nREGISTRANDO....\n" + professores+"\n" + "\nPROFESSOR REGISTRADO COM SUCESSO.\n"+"\n*****************\n");
    }

    public void excluirProfessor(Integer codigoProfessor) {

    }

    public void registrarAluno(Aluno aluno) {
        this.getAlunos().add(aluno);
        System.out.println("REGISTRANDO....\n" + aluno + "\nALUNO REGISTRADO COM SUCESSO.\n"+"\n*****************\n");
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
