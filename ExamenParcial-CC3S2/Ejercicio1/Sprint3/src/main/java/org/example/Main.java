package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el nivel de dificultad:\n1.Facil\n2.Medio\n3.Dificil");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                Question easyQuestion = new Question(
                        "Seleccione la opcion que no es una fruta",
                        new String[]{"Madrid", "Londres", "Paris"},
                        "Papa");
        }
    }
}