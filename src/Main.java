public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("1", "Nam", 20, 30000000, 5000000);
        System.out.println(waiter);
        System.out.printf("Luong cua waiter: %d\n", waiter.calculatorSalary());

        Kitchen kitchen = new Kitchen("2", "Hell's Kitchen", 5, 100000000, 10000000);
        System.out.println(kitchen);
        System.out.printf("Luong kitchen: %d", kitchen.calculatorSalary());

    }
}
