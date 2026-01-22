public class PttKargo implements ShippingStrategy
{
    @Override
    public double calculate(double weight) {
        return weight * 3;
    }
}
