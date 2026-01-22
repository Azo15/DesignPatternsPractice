public class Order {
    private ShippingStrategy shippingStrategy;

    // Sınavda boş constructor da eklenebilir
    public Order() {}

    public Order(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void calculateTotalShipping(double weight) {
        // 1. Önce null kontrolü yapıyoruz
        if (shippingStrategy == null) {
            System.out.println("Hata: Önce bir kargo firması seçmelisiniz!");
            return; // Hata varsa metottan çıkıyoruz (Aşağıdaki kodu çalıştırmıyoruz)
        }

        // 2. Eğer null değilse, hesaplamayı yapıp ekrana yazdırıyoruz
        double result = shippingStrategy.calculate(weight);
        System.out.println("Kargo Hesaplama Sonucu: " + result + " TL");
    }
}