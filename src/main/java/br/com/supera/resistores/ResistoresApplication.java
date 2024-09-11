package br.com.supera.resistores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ResistoresApplication {

	public static void main(String[] args) {

		SpringApplication.run(ResistoresApplication.class, args);

		System.out.println(getResistorColorCode("47 ohms"));
		System.out.println(getResistorColorCode("4.7k ohms"));
		System.out.println(getResistorColorCode("1M ohms"));
		System.out.println(getResistorColorCode("10 ohms"));
		System.out.println(getResistorColorCode("220 ohms"));
		System.out.println(getResistorColorCode("1k ohms"));
		System.out.println(getResistorColorCode("100 ohms"));
		System.out.println(getResistorColorCode("330 ohms"));
		System.out.println(getResistorColorCode("470 ohms"));
		System.out.println(getResistorColorCode("680 ohms"));
		System.out.println(getResistorColorCode("2M ohms"));

	}

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

