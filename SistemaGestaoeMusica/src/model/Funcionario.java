package model;

public class Funcionario extends Pessoa
implements Identificavel {
private String cracha;

public Funcionario(String nome, int idade, String cracha) {
    super(nome, idade);
    this.cracha = cracha;
}

@Override
public void atividade() {
    System.out.println(nome + "está realixando tarefas administrativas.");
}

@Override
public String getId() {
    return cracha;
}
}
