package calculator.domain;

import calculator.domain.operation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CalcOperator {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String NOT_FOUR_OPERATOR_MESSAGE = "사칙연산의 기호가 아닙니다.";
    private static final List<String> FOUR_OPERATORS = Arrays.asList(PLUS, MINUS, MULTIPLICATION, DIVISION);

    private final String operator;

    public CalcOperator(String operator) {
        this.operator = checkOperator(operator);
    }

    private String checkOperator(String operator) {
        if (FOUR_OPERATORS.contains(operator)) {
            return operator;
        }
        throw new IllegalArgumentException(NOT_FOUR_OPERATOR_MESSAGE);
    }

    public ArithmeticOperation operate() {
        if (operator.equals(PLUS)) {
            return new AddOperation();
        }
        if (operator.equals(MINUS)) {
            return new SubtractOperation();
        }
        if (operator.equals(MULTIPLICATION)) {
            return new MultiplyOperation();
        }
        if (operator.equals(DIVISION)) {
            return new DivideOperation();
        }
        throw new IllegalArgumentException(NOT_FOUR_OPERATOR_MESSAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalcOperator operator1 = (CalcOperator) o;
        return Objects.equals(operator, operator1.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator);
    }
}
