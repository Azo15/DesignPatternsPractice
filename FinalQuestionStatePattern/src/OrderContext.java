public class OrderContext {
    // Durum nesnelerini burada bir kez oluşturuyoruz
    private OrderState newOrderState;
    private OrderState paidOrderState;
    private OrderState shippedOrderState;
    private OrderState deliveredOrderState;

    private OrderState currentState;

    public OrderContext() {
        // Durumlar oluşturulurken Context (this) referansı gönderilir
        newOrderState = new NewOrderState(this);
        paidOrderState = new PaidOrderState(this);
        shippedOrderState = new ShippedOrderState(this);
        deliveredOrderState = new DeliveredOrderState(this);

        // Başlangıç durumu: Yeni Sipariş
        currentState = newOrderState;
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    // Durum Geçişleri İçin Kritik Getter Metotları
    public OrderState getNewOrderState() { return newOrderState; }
    public OrderState getPaidOrderState() { return paidOrderState; }
    public OrderState getShippedOrderState() { return shippedOrderState; }
    public OrderState getDeliveredOrderState() { return deliveredOrderState; }

    // Delegasyon Metotları (İşi o anki duruma paslar)
    public void pay() { currentState.payOrder(); }
    public void ship() { currentState.shipOrder(); }
    public void deliver() { currentState.deliverOrder(); }
}