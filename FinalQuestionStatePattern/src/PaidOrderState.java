public class PaidOrderState implements OrderState {
    private OrderContext orderContext;

    public PaidOrderState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    @Override
    public void payOrder() {
        System.out.println("Hata: Ödeme zaten yapılmış.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Sipariş kargoya verildi.");
        orderContext.setState(orderContext.getShippedOrderState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Hata: Henüz kargolanmamış ürün teslim edilemez.");
    }
}