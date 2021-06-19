package Exercicio06;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String data;
    private Float altura;     
    public String getNome() {
        return nome;    
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float altura) {
        this.altura = altura;
    }
     public String toString(){
        return " Nome: "+getNome()+ " \n Data de Nascimento: "+getData()+" \n Altura: "+getAltura()+" m \n";
    } 
}