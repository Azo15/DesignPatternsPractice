public class DeliveredOrderState implements OrderState {
    private OrderContext orderContext;

    public DeliveredOrderState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    @Override
    public void payOrder() {
        System.out.println("Hata: Teslim edilmiş sipariş için ödeme yapılamaz.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Hata: Teslim edilmiş sipariş tekrar kargolanamaz.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Hata: Ürün zaten teslim edilmiş.");
    }
}