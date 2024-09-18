import java.util.ArrayList;

import model.Pessoa;
import model.Aluno;
import model.Professor;
import model.Funcionario;
import model.Identificavel;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Ryan", 15, "A130"));
        pessoas.add(new Professor("Anjos", 49, "S180"));
        pessoas.add(new Funcionario("Thelma", 50, "C190"));

        for(Pessoa pessoa : pessoas) {
            pessoa.atividade();

            if(pessoa instanceof Identificavel) {
                Identificavel identificavel = (Identificavel) pessoa;
                System.out.println("ID: " + identificavel.getId());
            }
        }
    }
}
