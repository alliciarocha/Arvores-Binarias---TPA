package model.comparator;

import java.util.Comparator;

import model.domain.Aluno;

/**
 *
 * @author victoriocarvalho
 * 
 * Essa é comparadora de alunos por nome que será utilizada para criar as árvores
 * nos programas de teste para redigir os relatórios.
 */

public class ComparadorAlunoPorNome implements Comparator<Aluno> {
 
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    
}
