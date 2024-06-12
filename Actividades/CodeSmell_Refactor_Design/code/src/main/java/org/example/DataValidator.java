package org.example;

import java.util.*;

public class DataValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();

        printer.showInfo("Ingrese la opcion de data a validar:");
        printer.showInfo("\n1. Email\n2. Celular\n3. Codigo postal\n4. Url");

        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                printer.showInfo("Ingrese el email:");
                String email = scanner.nextLine();
                printer.showInfo("El email es válido: " + validateEmail(email));
                break;
            case 2:
                printer.showInfo("Ingrese el número de celular:");
                String celular = scanner.nextLine();
                printer.showInfo("El número de celular es válido: " + validatePhoneNumber(celular));
                break;
            case 3:
                printer.showInfo("Ingrese el código postal:");
                String codigoPostal = scanner.nextLine();
                printer.showInfo("El código postal es válido: " + validatePostalCode(codigoPostal));
                break;
            case 4:
                printer.showInfo("Ingrese la URL:");
                String url = scanner.nextLine();
                printer.showInfo("La URL es válida: " + validateURL(url));
                break;
            default:
                printer.showError("Opción no válida.");
        }

        scanner.close();
    }

    public static boolean validateEmail(String email) {
        String emailRegex =  "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex =  "^\\+?\\d{1,3}?[- .]?\\d{1,5}?[- .]?\\d{4,10}$";
        return phoneNumber.matches(phoneRegex);
    }

    public static boolean validatePostalCode(String postalCode) {
        String postalCodeRegex = "^\\d{5}$";
        return postalCode.matches(postalCodeRegex);
    }

    public static boolean validateURL(String url) {
        String urlRegex = "^(https?://)?(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/.*)?$";
        return url.matches(urlRegex);
    }


}
