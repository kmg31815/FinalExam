package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class McDonald {
	int total = 0;
	List<Food> foods = new ArrayList<>();

	public void on() {
		for (int i = 0; i < foods.size(); i++) {
			Food food = foods.get(i);
			System.out.println(food.getNumber() + ")\t" + food.getName());
		}
		System.out.println("8)\t結算");
		System.out.println("請輸入餐點:");
		Scanner scanner = new Scanner(System.in);
		int n = -1;
		while (n != 0) {
			n = scanner.nextInt();
			switch (n) {
			case 1:
				System.out.println("請輸入數量:");
				int n1 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food1 = foods.get(n - 1);
				System.out.println(food1.getNumber() + ".\t" + food1.getName() + "\t" + n1 + "\t份");
				System.out.println("=================");
				break;
			case 2:
				System.out.println("請輸入數量:");
				int n2 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food2 = foods.get(n - 1);
				System.out.println(food2.getNumber() + ".\t" + food2.getName() + "\t" + n2 + "\t份");
				System.out.println("=================");
				break;
			case 3:
				System.out.println("請輸入數量:");
				int n3 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food3 = foods.get(n - 1);
				System.out.println(food3.getNumber() + ".\t" + food3.getName() + "\t" + n3 + "\t份");
				System.out.println("=================");
				break;
			case 4:
				System.out.println("請輸入數量:");
				int n4 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food4 = foods.get(n - 1);
				System.out.println(food4.getNumber() + ".\t" + food4.getName() + "\t" + n4 + "\t份");
				System.out.println("=================");
				break;
			case 5:
				System.out.println("請輸入數量:");
				int n5 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food5 = foods.get(n - 1);
				System.out.println(food5.getNumber() + ".\t" + food5.getName() + "\t" + n5 + "\t份");
				System.out.println("=================");
				break;
			case 6:
				System.out.println("請輸入數量:");
				int n6 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food6 = foods.get(n - 1);
				System.out.println(food6.getNumber() + ".\t" + food6.getName() + "\t" + n6 + "\t份");
				System.out.println("=================");
				break;
			case 7:
				System.out.println("請輸入數量:");
				int n7 = scanner.nextInt();
				System.out.println("目前餐點:");
				Food food7 = foods.get(n - 1);
				System.out.println(food7.getNumber() + ".\t" + food7.getName() + "\t" + n7 + "\t份");
				System.out.println("=================");
				break;
			case 8:
				System.out.println("所有餐點:");
				Food food8 = foods.get(n - 1);
				System.out.println(food8.getNumber() + ".\t" + food8.getName());
				System.out.println("=================");
				break;
			default:
				break;
			}
		}
	}
}
