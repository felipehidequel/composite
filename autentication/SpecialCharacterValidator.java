package estrutural.composite.autentication;

public class SpecialCharacterValidator implements PasswordValidation{
    public boolean validate(String value){
        return value.matches(".*[!@#$%&*].*");
    }
}
