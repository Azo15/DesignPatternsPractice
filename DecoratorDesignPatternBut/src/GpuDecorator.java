public class GpuDecorator extends ComputerDecorator{
    public GpuDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" +2 TB SSD disk";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 5000;
    }
}
