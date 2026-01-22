//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderContext siparis = new OrderContext();

        // 1. Önce kargolamayı deneyelim (Hata vermeli)
        siparis.ship();

        // 2. Ödeme yapalım
        siparis.pay();

        // 3. Kargoya verelim
        siparis.ship();

        // 4. Teslim edelim
        siparis.deliver();
    }
}