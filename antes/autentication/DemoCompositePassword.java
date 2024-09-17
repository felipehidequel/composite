package antes.autentication;

import java.util.Scanner;

public class DemoCompositePassword {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String password;

        LenghthValidator lengthValidator = new LenghthValidator(8);
        UppercaseValidator uppercaseValidator = new UppercaseValidator();
        SpecialCharacterValidator specialCharacterValidator = new SpecialCharacterValidator();
        boolean repete = false;

        do {
            info("Informe a senha de usuario: ");
            password = sc.nextLine();
            if (lengthValidator.validate(password) && uppercaseValidator.validate(password) && specialCharacterValidator.validate(password)){
                info("Senha valida!");
                repete = false;
            } else {
                warning("Senha invalida!");
                repete = true;
                requirementsPassword();
            }
        } while (repete);

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
