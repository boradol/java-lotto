package calculator.domain.operation;

import calculator.domain.CalcNumber;

public class DivideOperation implements ArithmeticOperation {
    @Override
    public CalcNumber calculate(CalcNumber a, CalcNumber b) {
        return new CalcNumber(a.getNumber() / b.getNumber());
    }
}
