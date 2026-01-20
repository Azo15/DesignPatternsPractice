public class ComputerDecorator implements Computer {
    protected Computer computer;
    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }
    @Override
    public double getCost() {
        return computer.getCost();
    }
    @Override
    public String getDescription() {
        return computer.getDescription();
    }
}
