package estrutural.composite.autentication;

import java.util.ArrayList;

/**
 * Composite
 * CompositePasswordValidator
 */
public class CompositePasswordValidator {
    private ArrayList<PasswordValidation> validators;

    public CompositePasswordValidator() {
        this.validators = new ArrayList<>();
    }

    public CompositePasswordValidator(PasswordValidation... validators) {
        this.validators = new ArrayList<>();
        for (PasswordValidation validator : validators) {
            this.validators.add(validator);
        }
    }

    public void add(PasswordValidation validator) {
        this.validators.add(validator);
    }

    public boolean validate(String password) {
        for (PasswordValidation validator : validators) {
            if (!validator.validate(password)) {
                return false;
            }
        }
        return true;
    }
}
