package br.com.digitalhouse;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        ProfessorTitular tairo = new ProfessorTitular("Tairo","Miguel",10,101,"Mobile");
        ProfessorTitular jessica = new ProfessorTitular("Jessica","Correa",5,102,"Android");
        ProfessorTitular cristiano = new ProfessorTitular("Cristiano","Mariano",6,103,"Java");
        ProfessorTitular vini = new ProfessorTitular("Vini","PHP",7,104,"FullStack");
        ProfessorAdjunto jose = new ProfessorAdjunto("José","Alberto",3,105,5);
        ProfessorAdjunto jeff = new ProfessorAdjunto("Jeff","Burns",2,106,5);
        ProfessorAdjunto ted = new ProfessorAdjunto("Ted","Mosby",3,107,5);
        ProfessorAdjunto barney = new ProfessorAdjunto("Barney","Stinson",6,108,5);

        tairo.regi





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

