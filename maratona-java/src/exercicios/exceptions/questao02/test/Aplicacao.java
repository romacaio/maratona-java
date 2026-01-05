package exercicios.exceptions.questao02.test;

import exercicios.exceptions.questao02.exceptions.AgendaCheiaException;
import exercicios.exceptions.questao02.exceptions.ContatoNaoExisteException;
import exercicios.exceptions.questao02.model.Agenda;
import exercicios.exceptions.questao02.model.Contato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        menuPrincipal(sc, agenda);
    }

    public static void menuPrincipal(Scanner sc, Agenda agenda) {
        while (true) {
            int op;

            try {
                System.out.println("Digite a opção desejada: ");
                System.out.println("[1] - Adicionar contatos na agenda ");
                System.out.println("[2] - Consultar contatos da agenda ");
                System.out.println("[3] - Sair ");

                op = sc.nextInt();
                sc.nextLine();
                if (op > 3 || op < 1) throw new IllegalArgumentException();

            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Digite uma opção válida");
                sc.nextLine();
                continue;
            }
            switch (op) {
                case 1:
                    menuAdicionaContatos(sc, agenda);
                    break;

                case 2:
                    menuConsultaContato(sc, agenda);
                    break;

                default:
                    System.exit(0);
            }
            continue;
        }
    }

    public static void menuAdicionaContatos(Scanner sc, Agenda agenda) {
        while (true) {
            System.out.println("## Adicionar na agenda ##");

            try {
                System.out.println("Nome: ");
                String nome = sc.nextLine();

                System.out.println("Telefone: ");
                String telefone = sc.nextLine();

                // Caso tenha sido passado uma String sem valores númericos a NumberFormatException é lançada.
                Long isLongTelefone = Long.parseLong(telefone);

                System.out.println("Email: ");
                String email = sc.nextLine();

                Contato contato = new Contato(nome, telefone, email);
                agenda.adiciona(contato);

                System.out.println("Contato Adicionado com sucesso!\n");
                continue;

            } catch (NumberFormatException e) {
                System.out.println("Digite algo válido\n");
                continue;

            } catch (AgendaCheiaException e) {
                System.out.println(e.getMessage() + "\n");
                System.out.println("Seus contatos na Agenda: \n" + agenda);
                return;
            }
        }
    }

    public static void menuConsultaContato(Scanner sc, Agenda agenda) {
        while (true) {
            System.out.println("## Consulta na agenda ##");

            try {
                System.out.println("Nome do Contato a ser buscado: ");
                String nomeBusca = sc.nextLine();

                Contato contatoEncontrado = agenda.consultaPorNome(nomeBusca);
                System.out.println("Contato encontrado: \n" + contatoEncontrado + "\n");

            } catch (ContatoNaoExisteException e) {
                System.out.println(e.getMessage() + "\n");
                break;
            }
            break;
        }
    }


}
