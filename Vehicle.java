package Work;

import java.util.HashMap;
import java.util.Scanner;

public class Vehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> vehicles = new HashMap<>();
		vehicles.put("Honda 300", "Honda");
		vehicles.put("Hyundai Azera", "Hyundai");
		vehicles.put("Bugatti End game", "Bugatti");
		vehicles.put("Ferrari SUV", "Ferrari");
		vehicles.put("Jeep Wrangler", "Jeep");
		Scanner input = new Scanner(System.in);
		System.out.println("What car model are you looking for?");
		String userReply = input.nextLine();
		boolean isFound = false;
		for (String model : vehicles.keySet()) {
			if (model.equals(userReply)) {
				System.out.printf("The model is %s and the make is %s\n", model, vehicles.get(model));
				isFound = true;
			}

		}
		if (!isFound) {
			System.out.printf("Oh You're looking for %s our %s selection is right over here\n", userReply,
					vehicles.get("Honda 300"));
		}

		input.close();
	}
}
