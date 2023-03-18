/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.animais;

/**
 *
 * @author Windows
 */
public class Animais {
    String cor;
    int idade;
    float altura;
    String nome;
    String raca;
    
    Animais(){
        
    }
    Animais(String cor){
        this.cor=cor;
    }
    Animais(String cor, int idade){
        this.cor=cor;
        this.idade=idade;
    }
    Animais(String cor, int idade, float altura){
        this.cor=cor;
        this.idade=idade;
        this.altura=altura;
    }
    Animais(String cor, int idade, float altura, String nome){
        this.cor=cor;
        this.idade=idade;
        this.altura=altura;
        this.nome=nome;
    }
    Animais(String cor, int idade, float altura, String nome,String raca){
        this.cor=cor;
        this.idade=idade;
        this.altura=altura;
        this.nome=nome;
        this.raca=raca; 
    }
}

