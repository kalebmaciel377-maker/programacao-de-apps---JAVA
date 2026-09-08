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
public class atividadeFor {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,
                "Digite o nome do jogado: ");
        
        int pontos1 = 0, total_pontos = 0;
        
        for(int i = 1; i < 4; i++){
            pontos1 = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Digite a pontuação da partida " + i + ": "));
            
            total_pontos = total_pontos + pontos1;
        }
        
        if (total_pontos >= 100){
            JOptionPane.showMessageDialog(null,
                    "Nome do jogador: " + nome + "\n" +
                    "total de pontos: " + total_pontos + "\n" +
                    "Jogador aprovado!!!");
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Nome do jogador: " + nome + "\n" +
                    "total de pontos: " + total_pontos + "\n" +
                    "Jogador reprovado!!!");
        }
            
    }
}
