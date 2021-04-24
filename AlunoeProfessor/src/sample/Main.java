package sample;

import sample.model.Aluno;
import sample.model.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Emanuelli", 7.0, 7.8);
        System.out.println(aluno + "\n");

        Professor professor = new Professor();
        professor.setNome("Paulo");
        professor.setSalario(12, 210);
        System.out.println(professor);
    }
}