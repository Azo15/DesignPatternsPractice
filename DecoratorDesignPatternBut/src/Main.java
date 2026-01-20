//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Basic Computer
        Computer computer = new BasicComputer();
        System.out.println("Description :"+ computer.getDescription());
        System.out.println("Cost :"+ computer.getCost()+"\n\n\n");

//       Computer with Ram (16)
        Computer ramComputer = new RamDecorator(new BasicComputer(), 16);
        System.out.println("Description :"+ ramComputer.getDescription());
        System.out.println("Cost :"+ ramComputer.getCost()+"\n\n\n");


//        Computer with GPU
        Computer diskComputer = new GpuDecorator(new BasicComputer());
        System.out.println("Description :"+ diskComputer.getDescription());
        System.out.println("Cost :"+ diskComputer.getCost()+"\n\n\n");






    }
}