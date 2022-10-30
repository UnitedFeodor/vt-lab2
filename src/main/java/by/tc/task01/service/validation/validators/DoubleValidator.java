package by.tc.task01.service.validation.validators;

import by.tc.task01.service.validation.ValueValidator;

/**
 * Implements simple value validator for double type
 */
public class DoubleValidator implements ValueValidator {
    /**
     *
     * @param obj value to validate
     * @return if matches
     */
    @Override
    public boolean validate(Object obj) {
        try {

            return Double.parseDouble(String.valueOf(obj)) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
