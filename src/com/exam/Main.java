package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		McDonald mc = new McDonald();
		try {
			FileReader fr = new FileReader("menu.txt");
			BufferedReader into = new BufferedReader(fr);
			String line;
			line = into.readLine();
			String[] tokens = line.split(",");
			for (int i = 0; i < 7; i++) {
				int number = Integer.parseInt(tokens[i * 4]);
				String name = tokens[i * 4 + 1];
				mc.foods.add(new Food(number, name));
			}
			mc.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
