import java.util.Scanner;

public class Goods {
    private String productName;
    private String issueDate;
    private double price;
    private int quantity;
    private String invoiceNumber;

    // Конструктор класу
    public Goods(String productName, String issueDate, double price, int quantity, String invoiceNumber) {
        this.productName = productName;
        this.issueDate = issueDate;
        this.price = price;
        this.quantity = quantity;
        this.invoiceNumber = invoiceNumber;
    }

    // Метод для зміни ціни товару
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    // Метод для зміни кількості товару
    public void changeQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Метод для обчислення вартості товару
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Додавання публічних методів для доступу до приватних полів
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Метод для виведення інформації про товар
    public void displayProductInfo() {
        System.out.println("Інформація про товар:");
        System.out.println("Назва товару: " + productName);
        System.out.println("Дата оформлення: " + issueDate);
        System.out.println("Ціна товару: " + price);
        System.out.println("Кількість одиниць товару: " + quantity);
        System.out.println("Номер накладної: " + invoiceNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних від користувача
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

        // Створення об'єкту класу Goods
        Goods goods = new Goods(productName, issueDate, price, quantity, invoiceNumber);

        // Виведення інформації про товар
        goods.displayProductInfo();

        // Зміна ціни товару
        System.out.print("Введіть нову ціну товару: ");
        double newPrice = scanner.nextDouble();
        goods.changePrice(newPrice);

        // Зміна кількості товару
        System.out.print("Введіть нову кількість товару: ");
        int newQuantity = scanner.nextInt();
        goods.changeQuantity(newQuantity);

        // Виведення оновленої інформації про товар
        goods.displayProductInfo();

        // Обчислення та виведення вартості товару
        double totalCost = goods.calculateTotalCost();
        System.out.println("Загальна вартість товару: " + totalCost);

        scanner.close();
    }
}
