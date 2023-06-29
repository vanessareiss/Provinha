/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_vanessa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }


    
    @Override
    public double getSalarioFinal() {
       return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                
                "\n Carteira De Habilitação: " + carteiraDeHabilitacao;
    }
    
    
    
    
    
    
}
