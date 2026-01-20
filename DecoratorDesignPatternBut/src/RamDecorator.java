public class RamDecorator extends ComputerDecorator {
    private int ram;

    public RamDecorator(Computer computer, int ram) {
        super(computer);
        this.ram = ram;
    }

    @Override
    public double getCost() {
        double ramPrice = 0;
        switch (ram) {
            case 8:
                ramPrice = 4500;
                break;
            case 16:
                ramPrice = 9000;
                break;
            case 32:
                ramPrice = 15000;
                break;
            default:
                ramPrice = 0;
        }
        return super.getCost() + ramPrice;
    }
    @Override
    public String getDescription() {
        return super.getDescription() +"+"+ ram + " RAM";
    }
}
