/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.animais;

/**
 *
 * @author Windows
 */
public class NewClass {
    public static void main(String[]args){
        Animais p1 = new Animais();
        p1.cor="Azul";
        p1.idade=12;
        p1.altura=45.6f;
        p1.nome="Dog";
        p1.raca="Pincher";
        
        Animais p2 = new Animais();
        p2.cor="Verde";
        p2.idade=5;
        p2.altura=20.0f;
        p2.nome="Bender";
        p2.raca="Pastor Alemão";
        
        Animais p3 = new Animais();
        p3.cor="Branco";
        p3.idade=14;
        p3.altura=30.0f;
        p3.nome="Caco";
        p3.raca="Pit Bull";
        
        Animais p4 = new Animais();
        p4.cor="Preto";
        p4.idade=4;
        p4.altura=12.0f;
        p4.nome="Bidu";
        p4.raca="Buldogue";
        
        Animais p5 = new Animais();
        p5.cor="Amarelo";
        p5.idade=20;
        p5.altura=30.0f;
        p5.nome="Coco";
        p5.raca="Dalmata";
        
        System.out.print("Nome: "+p1.nome+"||| Idade: "+p1.idade+"||| Cor: "+p1.cor+"||| Altura: "+p1.altura+"||| Raça: "+p1.raca+"\n");
        System.out.print("Nome: "+p2.nome+"||| Idade: "+p2.idade+"||| Cor: "+p2.cor+"||| Altura: "+p2.altura+"||| Raça: "+p2.raca+"\n");
        System.out.print("Nome: "+p3.nome+"||| Idade: "+p3.idade+"||| Cor: "+p3.cor+"||| Altura: "+p3.altura+"||| Raça: "+p3.raca+"\n");
        System.out.print("Nome: "+p4.nome+"||| Idade: "+p4.idade+"||| Cor: "+p4.cor+"||| Altura: "+p4.altura+"||| Raça: "+p4.raca+"\n");
        System.out.print("Nome: "+p5.nome+"||| Idade: "+p5.idade+"||| Cor: "+p5.cor+"||| Altura: "+p5.altura+"||| Raça: "+p5.raca);
    }
}
