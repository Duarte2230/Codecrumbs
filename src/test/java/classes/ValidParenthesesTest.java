package classes;

import Main.classes.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses validator = new ValidParentheses();

    @Test
    void shouldReturnTrueForEmptyString() {
        assertTrue(validator.isValid(""));
    }

    @Test
    void shouldReturnTrueForSinglePairParentheses() {
        assertTrue(validator.isValid("()"));
        assertTrue(validator.isValid("[]"));
        assertTrue(validator.isValid("{}"));
    }

    @Test
    void shouldReturnTrueForNestedPairs() {
        assertTrue(validator.isValid("({[]})"));
        assertTrue(validator.isValid("({})[]"));
    }

    @Test
    void shouldReturnFalseForMismatchedPairs() {
        assertFalse(validator.isValid("(]"));
        assertFalse(validator.isValid("{[}]"));
        assertFalse(validator.isValid("[(])"));
    }

    @Test
    void shouldReturnFalseForUnclosedOpenings() {
        assertFalse(validator.isValid("("));
        assertFalse(validator.isValid("({["));
    }

    @Test
    void shouldReturnFalseForUnmatchedClosings() {
        assertFalse(validator.isValid(")"));
        assertFalse(validator.isValid("()]"));
    }

    @Test
    void shouldReturnTrueForComplexValidString() {
        assertTrue(validator.isValid("(([]){})"));
    }
}

