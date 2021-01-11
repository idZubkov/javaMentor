import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите математическое выражение через пробел (напр. a + b)\n" +
                "После первого числа и знака выражения пробел обязателен\nКалькулятор умеет работать только с целыми числами\n" +
                "Доступные числа: 1-10 и I-X");
        try {
            String input = reader.readLine();
            Algorithm.calculate(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}