package by.tc.task01.service.validation.validators;

import by.tc.task01.entity.enums.Color;
import by.tc.task01.service.validation.ValueValidator;

/**
 * Implements simple value validator for color type
 */
public class ColorValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try{
            Color.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
