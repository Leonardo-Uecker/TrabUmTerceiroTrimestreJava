
package com.mycompany.exercicios;


public class Pessoa {
    public String nome;
    public Integer idade;
    public Float altura;
    
    public Pessoa(String nome, Integer idade, Float altura){
    this.nome = nome;
    this.idade = idade ;
    this.altura = altura;
    
    }
    public String fazeraniversario(){
        this.idade += 1;
        return "\nParabens! voçe esta comemorando mais um ano de vida!";
    }
    public String exibirDados(){
        return "\nNome: " + this.nome + "\nidade: " + this.idade + "\naltura" + this.altura;
    }
}
