package br.com.supera.resistores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ResistoresApplication {

	public static void main(String[] args) {

		SpringApplication.run(ResistoresApplication.class, args);

		System.out.println(Resistores.getResistorColorCode("47 ohms"));
		System.out.println(Resistores.getResistorColorCode("4.7k ohms"));
		System.out.println(Resistores.getResistorColorCode("1M ohms"));
		System.out.println(Resistores.getResistorColorCode("10 ohms"));
		System.out.println(Resistores.getResistorColorCode("220 ohms"));
		System.out.println(Resistores.getResistorColorCode("1k ohms"));
		System.out.println(Resistores.getResistorColorCode("100 ohms"));
		System.out.println(Resistores.getResistorColorCode("330 ohms"));
		System.out.println(Resistores.getResistorColorCode("470 ohms"));
		System.out.println(Resistores.getResistorColorCode("680 ohms"));
		System.out.println(Resistores.getResistorColorCode("2M ohms"));


		System.out.println("\n Desafio Snail: \n");

		int[][] matriz1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		int[][] matriz2 = {
				{1, 2, 3},
				{4, 10, 12},
				{6, 7, 33}
		};

		int[][] matriz3 = {
				{1, 2, 3, 1},
				{4, 5, 6, 4},
				{7, 8, 9, 7},
				{7, 8, 9, 7}
		};

		int[][] emptyMatriz = {};

		List<Integer> result1 = Snail.spiralOrder(matriz1);
		List<Integer> result2 = Snail.spiralOrder(matriz2);
		List<Integer> result3 = Snail.spiralOrder(matriz3);
		List<Integer> result4 = Snail.spiralOrder(emptyMatriz);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}

