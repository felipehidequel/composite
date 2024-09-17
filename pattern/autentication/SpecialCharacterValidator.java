package pattern.autentication;

public class SpecialCharacterValidator implements PasswordValidation{
    // @Override
    public boolean validate(String value){
        return value.matches(".*[!@#$%&*].*");
    }
}
