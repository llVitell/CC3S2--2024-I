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
                        new String[]{"Manzana", "Papa", "Platano"},
                        "Papa");
                quiz.loadQuestion(easyQuestion);
            case 2:
                Question midQuestion = new Question(
                        "Cual es la capital de Argentina",
                        new String[]{"Buenos Aires","Rosario","Messi"},
                        "Buenos Aires");
                quiz.loadQuestion(midQuestion);
            case 3:
                Question hardQuestion = new Question(
                        "Quien es el padre de la evolucion",
                        new String[]{"Descartes","Aristoteles","Darwin"},
                        "Darwin ");
                quiz.loadQuestion(hardQuestion);

        }
    }
}