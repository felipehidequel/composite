package estrutural.composite.autentication;

import java.util.Scanner;

public class DemoCompositePassword {
    public static void main(String[] args) {
        CompositePasswordValidator validator = new CompositePasswordValidator(new LenghthValidator(8),
                new UppercaseValidator(), new SpecialCharacterValidator());

        Scanner sc = new Scanner(System.in);
        String password;

        do {
            info("Informe a senha de usuario: ");
            password = sc.nextLine();
            if (validator.validate(password)) {
                info("Senha valida!");
            } else {
                warning("Senha invalida!");
                requirementsPassword();
            }
        } while (!validator.validate(password));

        sc.close();
    }

    public static void requirementsPassword() {
        System.out.println("*Requisitos");
        System.out.println("*No minimo 8 digitos");
        System.out.println("*Deverá conter uma letra maiuscula no minimo");
        System.out.println("*Deverá conter uma caractere especial no minimo (!@#$%&*)");
    }

    public static void info(String message) {
        System.out.println("\u001B[32m" + "[SISTEMA] " + "\u001B[0m" + message);
    }

    public static void warning(String message) {
        System.out.println("\u001B[33m" + "[SISTEMA] " + "\u001B[0m" + message);
    }

}
