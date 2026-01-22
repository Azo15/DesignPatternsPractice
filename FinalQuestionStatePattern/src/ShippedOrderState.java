public class ShippedOrderState implements OrderState {
    private OrderContext orderContext;

    public ShippedOrderState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    @Override
    public void payOrder() {
        System.out.println("Hata: Ödeme zaten yapılmış.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Hata: Ürün zaten kargoda.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Sipariş teslim edildi. İşlem tamamlandı.");
        orderContext.setState(orderContext.getDeliveredOrderState());
    }
}