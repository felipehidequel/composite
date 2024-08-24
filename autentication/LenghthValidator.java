
package estrutural.composite.autentication;

/** Leaf
 * LenghthValidator
 */
public class LenghthValidator implements PasswordValidation{
    private int minLenght;
    
    public LenghthValidator(int minLenght) {
        this.minLenght = minLenght;
    }

    @Override
    public boolean validate(String password) {
        return password.length() >= minLenght;
    }
}

