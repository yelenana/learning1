package day11;

public class Picker implements Worker {
    private int salary;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrders(warehouse.getCountOrders()+1);
    }

    @Override
    public void bonus() {
       if (warehouse.getCountOrders()>1500)
              salary*=3;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
