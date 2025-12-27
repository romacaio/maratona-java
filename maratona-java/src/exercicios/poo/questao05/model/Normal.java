package exercicios.poo.questao05.model;

public class Normal extends Ingresso{
    public Normal(double valor) {
        super(valor);
    }
    @Override
    public void imprimeValor(){
        System.out.println("## Ingresso Normal ##");
        super.imprimeValor();
    }
}
