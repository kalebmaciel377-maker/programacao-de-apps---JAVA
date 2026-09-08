package aula2;

import javax.swing.JOptionPane;

public class atividade {

    public static void main(String[] args) {

        // Solicita o nome do motorista
        String nome = JOptionPane.showInputDialog(
                null,
                "Digite o nome do motorista: "
        );

        // Solicita a placa do veículo
        String placa_veiculo = JOptionPane.showInputDialog(
                null,
                "Informe a placa do veículo: "
        );

        // Solicita a velocidade e converte o texto digitado para número inteiro
        int velocidade = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Informe a velocidade: "
                )
        );

        // Verifica se a velocidade é menor ou igual a 50
        if (velocidade <= 50) {

            JOptionPane.showMessageDialog(
                    null,
                    "Nome: " + nome + "\n" +
                    "Placa do veículo: " + placa_veiculo + "\n" +
                    "Velocidade: " + velocidade + "\n" +
                    "Velocidade normal\n" +
                    "Motorista não multado!!!"
            );

        } else { // Caso a velocidade seja maior que 50

            JOptionPane.showMessageDialog(
                    null,
                    "Nome: " + nome + "\n" +
                    "Placa do veículo: " + placa_veiculo + "\n" +
                    "Velocidade: " + velocidade + "\n" +
                    "Velocidade acima da média\n" +
                    "Motorista multado!!!"
            );
        }

    }
}