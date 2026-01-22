public class NewOrderState implements OrderState {
    private OrderContext orderContext;

    public NewOrderState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    @Override
    public void payOrder() {
        System.out.println("Ödeme alındı. Sipariş hazırlanıyor.");
        // Hocanın tarzı: Getter ile bir sonraki duruma geçiş
        orderContext.setState(orderContext.getPaidOrderState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Hata: Ödeme yapılmadan kargolanamaz.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Hata: Ödenmemiş ve kargolanmamış ürün teslim edilemez.");
    }
}