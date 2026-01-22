public class ArasKargo implements ShippingStrategy{
    @Override
    public double calculate(double weight) {
        return weight*5 + 10;
    }
}
