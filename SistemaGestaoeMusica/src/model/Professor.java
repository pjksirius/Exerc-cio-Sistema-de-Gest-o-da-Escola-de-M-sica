package model;

public class Professor extends Pessoa
implements Identificavel {
private String registroFuncional;

public Professor(String nome, int idade, String registroFuncional) {
    super(nome, idade);
    this.registroFuncional = registroFuncional;
}

@Override
public void atividade() {
    System.out.println(nome + "está ministrando aulas de música.");
}

@Override
public String getId() {
    return registroFuncional;
}
}
