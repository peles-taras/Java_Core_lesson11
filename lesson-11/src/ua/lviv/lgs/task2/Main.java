package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String[] material = { "Ўк≥ра", "јалькантара" };
		Random r = new Random();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Car[][] c = new Car[getRandomValue(1, 100)][getRandomValue(1, 100)];

		while (true) {
			menu();
			switch (sc.next()) {

			case "1": {
				sc = new Scanner(System.in);
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						c[i][j] = new Car(getRandomValue(20, 80), getRandomValue(10, 20), 
						material[r.nextInt(1)],getRandomValue(150, 700), 
						getRandomValue(1971, 2021));
					}
				}
				System.out.println(Arrays.deepToString(c));
				break;
			}

			case "2": {
				sc = new Scanner(System.in);

				for (Car[] cars : c) {
					Arrays.fill(cars, new Car(1, 1, "1", 1, 1));
					System.out.println(Arrays.toString(cars));
				}
			}
				break;

			default:
				System.out.println("\nќпц≥€ в≥дсутн€");

			}

		}

	}

	public static void menu() {
		System.out.println("¬вед≥ть число:");
		System.out.println("1: ўоб вивести toString() даних елемент≥в");
		System.out.println("2: Ўоб засетити одинаковий  об`Їкт класу јвто");
	}

	public static int getRandomValue(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value have to be lower than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}
}