package br.com.bcosta;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada
        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = scanner.nextLine();

        // Divide a string em uma lista de nomes
        List<String> nomes = Arrays.asList(entrada.split(","));

        // Remove espaços em branco e ordena os nomes
        nomes.replaceAll(String::trim);
        nomes.sort(String::compareToIgnoreCase);

        // Imprime os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}

