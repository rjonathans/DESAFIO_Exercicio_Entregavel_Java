package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalHouseManager {
    //Attributes
    private List<Aluno> alunosMatriculados = new ArrayList<>();
    private List<Professor> professoresCadastrados = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    //Methods
    public void registrarCurso(Curso curso) {
        this.cursos.add(curso);

    }

    public void excluirCurso(Integer codigoCurso) {

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codDeProfessor, String especialidade) {

    }

    public void excluirProfessor(Integer codigoProfessor) {

    }

    public void registrarAluno(Integer codigoAluno, Integer codigoCurso) {

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

    }

    public void consultarCurso(Integer codigoAluno) {

    }

    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código: ");
    int numEscolhido = scanner.nextInt();



}
