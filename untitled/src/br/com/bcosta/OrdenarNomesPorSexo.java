package br.com.bcosta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomesPorSexo {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada
        System.out.println("Digite os nomes e sexos (exemplo: Breno - M, Luana - F):");
        String entrada = scanner.nextLine();

        // Divide a string em uma lista de entradas
        List<String> entradas = Arrays.asList(entrada.split(","));

        // Listas para armazenar os nomes por sexo
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        // Processa cada entrada
        for (String item : entradas) {
            String[] partes = item.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    nomesMasculinos.add(nome);
                } else if (sexo.equals("F")) {
                    nomesFemininos.add(nome);
                }
            }
        }

        // Ordena os nomes
        nomesMasculinos.sort(String::compareToIgnoreCase);
        nomesFemininos.sort(String::compareToIgnoreCase);

        // Imprime os nomes por grupo
        System.out.println("Nomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}
