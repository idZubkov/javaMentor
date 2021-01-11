import java.util.Arrays;
import java.util.List;

public class Algorithm {

    public static void calculate(String input) {
        int firstNumber = 0;
        int secondNumber = 0;
        int resultOfExpression;
        String sign;
        boolean flag = false;

        List<String> inputChars = Arrays.asList(input.split(" "));
        sign = inputChars.get(1);
        try {
            firstNumber = Integer.parseInt(inputChars.get(0));
            secondNumber = Integer.parseInt(inputChars.get(2));
        } catch (Exception e) {
            try {
                firstNumber = Converter.convertToArabicNumeral(inputChars.get(0));
                secondNumber = Converter.convertToArabicNumeral(inputChars.get(2));
                flag = true;
            } catch (Exception e1) {
                System.err.println("Введены неверные данные");
            }
        }
        if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10) {
            System.out.println("Числа должны быть в пределе: 1-10 (I-X) и должны быть из одного набора (арабские/римские)");
            return;
        }

        switch (sign) {
            case "+":
                resultOfExpression = firstNumber + secondNumber;
                break;
            case "-":
                resultOfExpression = firstNumber - secondNumber;
                break;
            case "/":
                resultOfExpression = firstNumber / secondNumber;
                break;
            case "*":
                resultOfExpression = firstNumber * secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Неподходящий знак выражения");
        }
        if (flag) {                                                                      //флаг нужен для преобразования арабской цифры обратно в римскую
            String roman = Converter.convertToRomanNumeral(resultOfExpression);
            System.out.println(roman);
        } else System.out.println(resultOfExpression);
    }
}