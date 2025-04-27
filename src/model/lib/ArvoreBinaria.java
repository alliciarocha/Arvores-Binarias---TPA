package model.lib;

import java.util.Comparator;

public class ArvoreBinaria<T> implements IArvoreBinaria<T> {

    private class No {
        T valor;
        No esquerdo;
        No direito;

        No(T valor) {
            this.valor = valor;
        }
    }
    private No raiz;
    private Comparator<T> comparador;

    public ArvoreBinaria(Comparator<T> comparador) {
        this.comparador = comparador;
    }

    @Override
    public void adicionar(T novoValor) {
        No novoNo = new No(novoValor);
        if (raiz == null) {
            raiz = novoNo;
            return;
        }
        No atual = raiz;
        while (true) {
            int comparacao = comparador.compare(novoValor, atual.valor);
            if (comparacao < 0) {
                if (atual.esquerdo == null) {
                    atual.esquerdo = novoNo;
                    return;
                }
                atual = atual.esquerdo;
            } else if (comparacao > 0) {
                if (atual.direito == null) {
                    atual.direito = novoNo;
                    return;
                }
                atual = atual.direito;
            } else {
                // Se for igual... o que faremos??? Será admitido alguns valores iguais? Vai ser acreditado que não teremos que nos preocupar com isso?
                return;
            }
        }
    }

    public T pesquisar(T valor) {
        System.out.println("Pesquisando: " + valor); //só para não dá erro
        return valor;
    }

    public T pesquisar(T valor, Comparator comparador) {
        System.out.println("Pesquisando: " + valor);
        return valor;
    }

    public T remover(T valor){
        System.out.println("Remover: " + valor);
        return valor;
    }

    public int altura(){
        return 0;
    }

    public int quantidadeNos(){
        return 0;
    }

    public String caminharEmNivel(){
        return null;
    }

    public String caminharEmOrdem(){
        return null;
    }



}

