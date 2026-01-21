//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        XBankAPI xBankAPI = new XBankAPI();
        PaymentProcessor adapter = new XBankAdapter(xBankAPI);
        System.out.println("--- Ödeme İşlemi Başlatılıyor ---");
        adapter.makePayment(150.50);
    }
}