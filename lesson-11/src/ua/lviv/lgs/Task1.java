package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {

		Integer[] mas = { 123, 1, 12, 41, 16, 18, 91, 1235, 105 };

		Arrays.sort(mas);
		System.out.println("Порядок зростання: " + Arrays.toString(mas));

		Arrays.sort(mas, Collections.reverseOrder());
		System.out.println("Порядок спадання: " + Arrays.toString(mas));
	}

}
