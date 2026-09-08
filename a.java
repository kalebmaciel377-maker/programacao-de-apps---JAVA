/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author kaleb_m_santos
 */
public class a {
    public static void main(String[] args) {
        
        // mostra a mensssagem na tela
        JOptionPane.showMessageDialog(null,
                "OLa seja bem vindo");
        
        // pede o nome do usuario 
        String nome = JOptionPane.showInputDialog(null, "digite o seu nome: ");
        
        
        // pede a idade do usuario
        int idade = Integer.parseInt (
                JOptionPane.showInputDialog(null, 
                        "Digite a sua idade: "));
                
        // pede a altura  do usuario     
        double altura = Double.parseDouble (
                JOptionPane.showInputDialog(null , 
                        "digite a sua altura: "));
        
        // verifica se a idade e maio ou não que 18
        if(idade > 18){
            // se idade maior que 18
            JOptionPane.showMessageDialog(null,
                    "Maior de idade");
    } else {
            // idade menor que 18
            JOptionPane.showMessageDialog(null,
                    "Menor de idade");
}
        int resposta = JOptionPane.showConfirmDialog(null,
                "Voce deseja escolher: ",
                "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Voce escolheu sim");
        } 
        
        if(resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Voce escolheu não");
        } 
         else {
            JOptionPane.showMessageDialog(null,
                    "Voce cancelou");
        }
        
        
        
        
        
        
        
        
        
        
}
}