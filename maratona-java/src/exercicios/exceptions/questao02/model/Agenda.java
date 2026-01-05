package exercicios.exceptions.questao02.model;

import exercicios.exceptions.questao02.exceptions.AgendaCheiaException;
import exercicios.exceptions.questao02.exceptions.ContatoNaoExisteException;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        this.contatos = new Contato[2];
    }

    public Contato consultaPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return contatos[i];
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    public void adiciona(Contato contato) throws AgendaCheiaException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                return;
            }
        }
        throw new AgendaCheiaException();
    }

    public Contato[] getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato : contatos) {
            if (contato != null) {
                s += contato + "\n";
            }
        }
        return s;
    }
}
