public class Kitchen extends Employee {
    long serviceCharge;

    public Kitchen(String id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        long salary = basicSalary + serviceCharge;
        return salary;
    }
}
