package exercicios.colecoes.questao02.test;

import exercicios.colecoes.questao02.model.Paciente;
import exercicios.colecoes.questao02.model.Tipo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aplicacao {
    public static void main(String[] args) {

        Queue<Paciente> filaAtendimento = new PriorityQueue<>();
        filaAtendimento.offer(new Paciente("Caio", Tipo.NORMAL));
        filaAtendimento.offer(new Paciente("Júlio", Tipo.NORMAL));
        filaAtendimento.offer(new Paciente("Lara", Tipo.PRIORITARIO));
        filaAtendimento.offer(new Paciente("Ana", Tipo.NORMAL));
        filaAtendimento.offer(new Paciente("Paulo", Tipo.PRIORITARIO));
        filaAtendimento.offer(new Paciente("Joaquin", Tipo.NORMAL));
        filaAtendimento.offer(new Paciente("Letícia", Tipo.PRIORITARIO));

        System.out.println("Ordem de Atendimento:");

        Iterator<Paciente> iterator = filaAtendimento.iterator();
        while (!filaAtendimento.isEmpty()) {
            System.out.println(filaAtendimento.poll().getNome());
        }
    }
}
