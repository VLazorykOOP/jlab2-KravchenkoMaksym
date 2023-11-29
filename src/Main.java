import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть опцію:");
        System.out.println("1. Goods");
        System.out.println("2. Square");
        System.out.println("3. CustomCalendar");

        int option = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера після nextInt()

        switch (option) {
            case 1:
                // Код для Goods
                System.out.print("Введіть назву товару: ");
                String productName = scanner.nextLine();

                System.out.print("Введіть дату оформлення: ");
                String issueDate = scanner.nextLine();

                System.out.print("Введіть ціну товару: ");
                double price = scanner.nextDouble();

                System.out.print("Введіть кількість одиниць товару: ");
                int quantity = scanner.nextInt();

                scanner.nextLine(); // Очищення буфера введення

                System.out.print("Введіть номер накладної: ");
                String invoiceNumber = scanner.nextLine();

                Goods goods = new Goods(productName, issueDate, price, quantity, invoiceNumber);

                goods.displayProductInfo();

                System.out.print("Введіть нову ціну товару: ");
                double newPrice = scanner.nextDouble();
                goods.changePrice(newPrice);

                System.out.print("Введіть нову кількість товару: ");
                int newQuantity = scanner.nextInt();
                goods.changeQuantity(newQuantity);

                goods.displayProductInfo();

                double totalCost = goods.calculateTotalCost();
                System.out.println("Загальна вартість товару: " + totalCost);
                break;

            case 2:
                // Код для Square
                System.out.print("Введіть довжину сторони квадрата: ");
                double sideLength = scanner.nextDouble();
                Square square = new Square(sideLength);

                System.out.println("Периметр квадрата: " + square.getPerimeter());
                System.out.println("Площа квадрата: " + square.getArea());
                System.out.println("Довжина діагоналі квадрата: " + square.getDiagonalLength());
                break;

            case 3:
                // Код для CustomCalendar
                System.out.print("Введіть число: ");
                int day = scanner.nextInt();

                System.out.print("Введіть місяць (від 1 до 12): ");
                int month = scanner.nextInt();

                System.out.print("Введіть рік: ");
                int year = scanner.nextInt();

                CustomCalendar customCalendar = new CustomCalendar();
                String result = customCalendar.findDayOfMonthAndWeek(day, month, year);
                System.out.println(result);
                break;

            default:
                System.out.println("Невірна опція");
                break;
        }

        scanner.close();
    }
}
