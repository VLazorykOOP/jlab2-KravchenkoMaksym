import java.util.Scanner;

public class Square {
    private double side;

    // Конструктор класу для ініціалізації сторони квадрата
    public Square(double side) {
        this.side = side;
    }

    // Метод для отримання периметру квадрата
    public double getPerimeter() {
        return 4 * side;
    }

    // Метод для отримання площі квадрата
    public double getArea() {
        return side * side;
    }

    // Метод для отримання довжини діагоналі квадрата
    public double getDiagonalLength() {
        return Math.sqrt(2) * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запитайте користувача про сторону квадрата
        System.out.print("Введіть довжину сторони квадрата: ");
        double sideLength = scanner.nextDouble();

        // Створіть об'єкт квадрата
        Square square = new Square(sideLength);

        // Виведіть результати
        System.out.println("Периметр квадрата: " + square.getPerimeter());
        System.out.println("Площа квадрата: " + square.getArea());
        System.out.println("Довжина діагоналі квадрата: " + square.getDiagonalLength());
    }
}
