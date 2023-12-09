package TrafficContorl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        Scanner scanner = new Scanner(System.in);

        // Введення поточного стану світлофора від користувача
        System.out.print("Введіть поточний стан світлофора (RED, YELLOW або GREEN):");
        String userInput = scanner.nextLine();

        try {
            // Встановлення поточного стану на основі введення користувача
            trafficLight.currentColor = TrafficLight.Color.valueOf(userInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Невірне введення. Встановлено початковий стан: " + trafficLight.getCurrentColor().getDescription());
        }

        // Вивід поточного стану та перемикання наступного стану
        System.out.println("Поточний стан: " + trafficLight.getCurrentColor().getDescription());
        trafficLight.switchToNextColor();
        System.out.println("Наступний стан: " + trafficLight.getCurrentColor().getDescription());

        scanner.close();
    }
}
