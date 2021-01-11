import java.util.*;

public class Converter {

    private static final TreeMap<Integer, String> mapOfRomanNumerals = new TreeMap<>();
    private static final List<String> listOfRomanNumerals = new ArrayList<>();

    static {
        mapOfRomanNumerals.put(1, "I");
        mapOfRomanNumerals.put(4, "IV");
        mapOfRomanNumerals.put(5, "V");
        mapOfRomanNumerals.put(9, "IX");
        mapOfRomanNumerals.put(10, "X");
        mapOfRomanNumerals.put(40, "XL");
        mapOfRomanNumerals.put(50, "L");
        mapOfRomanNumerals.put(90, "XC");
        mapOfRomanNumerals.put(100, "C");
        listOfRomanNumerals.add("N");
        listOfRomanNumerals.add("I");
        listOfRomanNumerals.add("II");
        listOfRomanNumerals.add("III");
        listOfRomanNumerals.add("IV");
        listOfRomanNumerals.add("V");
        listOfRomanNumerals.add("VI");
        listOfRomanNumerals.add("VII");
        listOfRomanNumerals.add("VIII");
        listOfRomanNumerals.add("IX");
        listOfRomanNumerals.add("X");
    }

    public static String convertToRomanNumeral(int resultOfExpression) {
        int numberFromMap = mapOfRomanNumerals.floorKey(resultOfExpression);                //floorKey возвращает ближейшее значение из 'mapOfRomanNumerals' по нижней границе
        if (resultOfExpression == numberFromMap) {
            return mapOfRomanNumerals.get(resultOfExpression);
        }
        return mapOfRomanNumerals.get(numberFromMap) + convertToRomanNumeral(resultOfExpression - numberFromMap);
    }

    public static int convertToArabicNumeral(String resultOfExpression) {
        return listOfRomanNumerals.indexOf(resultOfExpression);                             //римская цифра равна по значению индексу из 'listOfRomanNumerals'
    }
}