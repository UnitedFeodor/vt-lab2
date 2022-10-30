package by.tc.task01.service.validation.validators;

import by.tc.task01.service.validation.ValueValidator;

/**
 * Implements simple value validator for button type
 */
public class StringValidator implements ValueValidator {
    /**
     *
     * @param obj value to validate
     * @return if matches
     */
    @Override
    public boolean validate(Object obj) {
        try{
            if (((String) obj).length() == 0 || ((String) obj).equals(""))
                return false;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
