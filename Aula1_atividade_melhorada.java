/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1_atividade;

import java.util.Scanner;

/**
 *
 * @author kaleb_m_santos
 */
public class Aula1_atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        
        String nome_produto;
        System.out.print("Digite o nome do produto: ");
        nome_produto = entrada.nextLine();
        
        int codigo_produto;
        System.out.print("Digite o codigo do produto: ");
        codigo_produto = entrada.nextInt();
        
        String categoria;
        System.out.print("Digite a categoria do produto: ");
        categoria = entrada.nextLine();
        categoria = entrada.nextLine();
        
        String marca;
        System.out.print("Digite a marca do produto: ");
        marca = entrada.nextLine();
        
        float preco;
        System.out.print("Digite o preço do produto: ");
        preco = entrada.nextFloat();
        
        int qtd_estoque;
        System.out.print("Digite a quantidade em estoque: ");
        qtd_estoque = entrada.nextInt();
        
        double peso;
        System.out.print("Digite o peso do produto: ");
        peso = entrada.nextDouble();
        
        boolean disponivel;
        System.out.print("Digte se o produto está disponivel?(sim/não)");
        disponivel = entrada.nextBoolean();
        
        System.out.println("Nome: " + nome_produto);
        System.out.println("Codigo do carro: " + codigo_produto);
        System.out.println("Categoria: " + categoria);
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade em estoque: " + qtd_estoque);
        System.out.println("Peso do carro: " + peso + "kg");
        System.out.println("Esta distponivel?: " + disponivel);
        
        

    }
    
}
