//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.print("PTT için ");
        order.setShippingStrategy(new PttKargo());
        order.calculateTotalShipping(12);
        System.out.println("\n\n");

        order.setShippingStrategy(new ArasKargo());
        System.out.println("Aras icin");
        order.calculateTotalShipping(12);
        System.out.println("\n\n");
    }
}