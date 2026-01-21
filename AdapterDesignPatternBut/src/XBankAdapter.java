public class XBankAdapter implements PaymentProcessor{
    XBankAPI api = new XBankAPI();
    public XBankAdapter(XBankAPI api){
        this.api = new XBankAPI();
    }
    @Override
    public void makePayment(double amount) {
        double centsDouble = amount * 100;
        int cents = (int) centsDouble;
        System.out.println("Adapter: TL/Double değer kuruş/int değerine dönüştürüldü.");
        api.sendPaymentInCents(cents);
    }

}
