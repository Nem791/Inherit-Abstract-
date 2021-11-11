public class Waiter extends Employee {
    long compensate;

    public Waiter(String id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        long salary = compensate + basicSalary;
        return salary;
    }
}
