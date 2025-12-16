package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Funcionario;

public class herancaTest02 {
    /*
        1. A JVM carrega a superclasse com os atributos e métodos estáticos e executa o bloco estático de inicialização da superclasse
        2. A JVM carrega a subclasse com seus atributos e métodos estáticos e executa o bloco estático de inicialização da subclasse
        3. Aloca o espaço em memória para o objeto completo.
        4. Inicializa os atributos da superclasse com valores default ou que foi passado
        5. executa os blocos de inicialização de instância da superclasse na ordem que aparecem
        6. executa o construtor da superclasse
        8. Inicializa os atributos da subclasse com os valores padrões ou o que foi passado
        9. executa os blocos de inicialização de instância da subclasse na ordem que aparecem
        10. executa o construtor da subclasse.
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
