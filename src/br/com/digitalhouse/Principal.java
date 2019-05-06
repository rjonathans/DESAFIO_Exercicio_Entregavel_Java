package br.com.digitalhouse;

import com.sun.org.apache.xpath.internal.operations.And;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {



        DigitalHouseManager dhm = new DigitalHouseManager();
        Curso c1 = new Curso();
        Matricula m1 = new Matricula();

        ProfessorTitular tairo = new ProfessorTitular("Tairo","Miguel",10,101,"Mobile");
        ProfessorTitular jessica = new ProfessorTitular("Jessica","Correa",5,102,"Android");
        ProfessorTitular cristiano = new ProfessorTitular("Cristiano","Mariano",6,103,"Java");
        ProfessorTitular vini = new ProfessorTitular("Vini","PHP",7,104,"FullStack");

        ProfessorAdjunto jose = new ProfessorAdjunto("José","Alberto",3,105,5);
        ProfessorAdjunto jeff = new ProfessorAdjunto("Jeff","Burns",2,106,5);
        ProfessorAdjunto ted = new ProfessorAdjunto("Ted","Mosby",3,107,5);
        ProfessorAdjunto barney = new ProfessorAdjunto("Barney","Stinson",6,108,5);

        Aluno robson = new Aluno("Robson","Jonathan",401);
        Aluno andreza = new Aluno("Andreza","Gomes",402);
        Aluno ana = new Aluno("Ana","Gonçalo",403);
        Aluno erica = new Aluno("Erica","Armenio",403);

        Curso mobile = new Curso("Mobile",301,tairo,jose,2);
        Curso android = new Curso("Android",302,jessica,jeff,2);
        Curso java = new Curso("java",303,cristiano,ted,2);
        Curso fullStack = new Curso("FullStack",303,vini,barney,2);

        dhm.registrarCurso(mobile);
        dhm.registrarCurso(android);
        dhm.registrarCurso(java);
        dhm.registrarCurso(fullStack);

        dhm.registrarProfessorTitular(tairo);
        dhm.registrarProfessorTitular(jessica);
        dhm.registrarProfessorTitular(cristiano);
        dhm.registrarProfessorTitular(vini);

        dhm.registrarAluno(erica);
        dhm.registrarAluno(robson);
        dhm.registrarAluno(andreza);
        dhm.registrarAluno(ana);

        c1.adicionarUmAluno(robson);


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma das opções");
        System.out.println("Professor - 1");
        System.out.println("Aluno - 2");
        System.out.println("Diretoria - 3");

        int numEscolhido = scanner.nextInt();

        if (numEscolhido == 1){
            System.out.println("Digite o código do livro");
            int codigo = scanner.nextInt();
            livraria.consultarLivroPorCodigo(codigo);
        }*/

    }
    }

