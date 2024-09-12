package br.com.supera.resistores;

import java.util.HashMap;
import java.util.Map;

public class Resistores {

    private static final Map<Integer, String> colorMap = new HashMap<>();

    static {
        colorMap.put(0, "preto");
        colorMap.put(1, "marrom");
        colorMap.put(2, "vermelho");
        colorMap.put(3, "laranja");
        colorMap.put(4, "amarelo");
        colorMap.put(5, "verde");
        colorMap.put(6, "azul");
        colorMap.put(7, "violeta");
        colorMap.put(8, "cinza");
        colorMap.put(9, "branco");
    }

    public static String getResistorColorCode(String input) {

        String valueString = input.replace(" ohms", "");
        double value;

        if (valueString.endsWith("k")) {
            value = Double.parseDouble(valueString.replace("k", "")) * 1_000;
        } else if (valueString.endsWith("M")) {
            value = Double.parseDouble(valueString.replace("M", "")) * 1_000_000;
        } else {
            value = Double.parseDouble(valueString);
        }

        String stringValue = String.valueOf((int) value);
        int firstDigit = Character.getNumericValue(stringValue.charAt(0));
        int secondDigit = stringValue.length() > 1 ? Character.getNumericValue(stringValue.charAt(1)) : 0;
        int multiplier = stringValue.length() - 2;

        StringBuilder colorCode = new StringBuilder();
        colorCode.append(colorMap.get(firstDigit)).append(" ");
        colorCode.append(colorMap.get(secondDigit)).append(" ");
        colorCode.append(colorMap.get(multiplier)).append(" ");
        colorCode.append("dourado");

        return colorCode.toString();
    }

}
