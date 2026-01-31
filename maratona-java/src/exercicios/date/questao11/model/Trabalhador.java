package exercicios.date.questao11.model;

import exercicios.date.questao11.Exception.ContratoInexistenteException;

import java.util.ArrayList;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private double salarioBase;
    private Departamento departamento;
    private ArrayList<ContratoPorHora> contratos;

    public Trabalhador(String nome, NivelTrabalhador nivel, Departamento departamento, double salarioBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, Departamento departamento, double salarioBase, ArrayList<ContratoPorHora> contratos) {
        this(nome, nivel, departamento, salarioBase);
        this.contratos = contratos;
    }

    public void addContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public ContratoPorHora removeContrato(ContratoPorHora contratoRemove) {
        for (ContratoPorHora contrato : contratos) {
            if (contrato.equals(contratoRemove)) {
                ContratoPorHora lixo = contrato;
                contratos.remove(contrato);
                return lixo;
            }
        }
        throw new ContratoInexistenteException();
    }

    public double renda(int ano, int mes) {
        double renda = salarioBase;
        for (ContratoPorHora contrato : contratos) {
            int year = contrato.getData().getYear();
            int month = contrato.getData().getMonthValue();

            if (ano == year && mes == month) {
                renda += contrato.valorTotal();
            }
        }
        return renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<ContratoPorHora> getContratos() {
        return contratos;
    }

}
