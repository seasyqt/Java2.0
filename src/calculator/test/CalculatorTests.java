package calculator.test;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {


@Test
    public void summationNumberTwoAndNullEqualTwo(){
    Calculator calculator = new Calculator(2,0,'+');
    calculator.result();
    double summ = calculator.getResult();
    Assert.assertEquals(2,summ,0);
}
@Test
    public void divisionNumberFourOnTwoEqualTwo(){
    Calculator calculator = new Calculator(4,2,'/');
    calculator.result();
    double summ = calculator.getResult();
    Assert.assertEquals(2,summ,0);
}
@Test
    public void multiplicationNumberFiveOnTenEqualFifty(){
    Calculator calculator = new Calculator(5,10,'*');
    calculator.result();
    double summ = calculator.getResult();
    Assert.assertEquals(50,summ,0);
}
@Test
    public void subtractionNumberFiveOnTenEqualNegativeFive(){
    Calculator calculator = new Calculator(5,10,'-');
    calculator.result();
    double summ = calculator.getResult();
    Assert.assertEquals(-5,summ,0);
}
@Test(expected = ArithmeticException.class)
    public void divisionOnNullEqualArithmeticException(){
    Calculator calculator = new Calculator(5,0,'/');
    calculator.result();
    calculator.getResult();
}
}
