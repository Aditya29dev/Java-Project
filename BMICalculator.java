import java.util.Scanner;

class Person {
    String name;
    double height;
    double weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        // BMI formula: weight (kg) / (height (m) * height (m))
        return weight / (height * height);
    }

    public String getCategory() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        Person person = new Person(name, height, weight);

        System.out.println("Name: " + person.name);
        System.out.println("Height: " + person.height + " meters");
        System.out.println("Weight: " + person.weight + " kilograms");

        double bmi = person.calculateBMI();
        String category = person.getCategory();

        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);

        scanner.close();
    }
}
