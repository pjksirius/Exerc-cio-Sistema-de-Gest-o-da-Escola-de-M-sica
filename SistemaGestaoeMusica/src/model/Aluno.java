package model;

public class Aluno extends Pessoa
implements Identificavel {
private String matricula;

public Aluno(String nome, int idade, String matricula) {
    super(nome, idade);
    this.matricula = matricula;
}

@Override
public void atividade() {
    System.out.println(nome + "está frequentando aulas e praticando instrumentos.");
}

@Override
public String getId() {
    return matricula;
}
}
