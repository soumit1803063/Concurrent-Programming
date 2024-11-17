import java.util.concurrent.atomic.AtomicInteger;

public class Customer1 {
    private static AtomicInteger idCounter = new AtomicInteger(0);
    private int id;
    public Customer1(){
        id = idCounter.getAndIncrement();
    }
    public static void main(String[] args) {
        Customer1 customer1 = new Customer1();
        Customer1 customer2 = new Customer1();
        System.out.println("Customer 1 ID: " + customer1.id);
        System.out.println("Customer 2 ID: " + customer2.id);
    }
}
