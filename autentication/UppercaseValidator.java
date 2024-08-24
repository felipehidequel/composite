package estrutural.composite.autentication;

/** Leaf
 * UppercaseValidator
 */
class UppercaseValidator implements PasswordValidation{
    public boolean validate(String value) {
        return value.matches(".*[A-Z].*");
    }
}