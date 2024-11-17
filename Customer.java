public class Customer {
    private static volatile int idCounter = 0;
    private int id;
    public Customer(){
        this.id = getAndIncrementID();
    }
    private synchronized int getAndIncrementID(){
        return Customer.idCounter++;
    }
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        System.out.println("Customer 1 ID: " + customer1.id);
        System.out.println("Customer 2 ID: " + customer2.id);
    }
}
