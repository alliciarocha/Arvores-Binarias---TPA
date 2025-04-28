package model.domain;

/**
 *
 * @author alliciarocha
 * 
 * Essa é a classe Aluno que representa um aluno no sistema de biblioteca
 * que será utilizada para criar as árvores nos programas de teste 
 * para redigir os relatórios.
 */

 public class Aluno extends Usuario {
 
     private int matricula;
 
     public Aluno(int matricula, String nome) {
         super(nome);
         this.matricula = matricula;
     }
 
     public int getMatricula() {
         return matricula;
     }
 
     public void setMatricula(int matricula) {
         this.matricula = matricula;
     }
 }
 
