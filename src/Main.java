
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.setNumbers(5, 3);
        calc.add();
        calc.displayResult("+");

        calc.setNumbers(10, 3);
        calc.subtract();
        calc.displayResult("-");

        calc.setNumbers(5, 3);
        calc.multiply();
        calc.displayResult("*");

        calc.setNumbers(5, 3);
        calc.divide();
        calc.displayResult("/");


    }
}