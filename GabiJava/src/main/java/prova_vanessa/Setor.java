/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova_vanessa;


public enum Setor {
    
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saúde"),
    JURIDICO ("Jurídico"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    MARKETING ("Marketing"), 
    OPERACOES ("Operações");
    
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
