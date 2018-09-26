package top.tfirst.stratregy;

public class FunMain {

    public static void main(String[] args) {
       //java的继承
        Duck duck = new RedHeadDuck();
        duck.setColor("yellow");
        duck.setName("donald duck");
        duck.setNum("NO001");
        ((RedHeadDuck) duck).setAge(18);
        duck.display();
        ((RedHeadDuck) duck).excessFun();
        SwamBehaver swamBehaver = new SwamBehaverImp1();
        duck.swamBehaver(swamBehaver);
        Duck woodDuck =new TimberDuck();
        FlyBehaver flyBehaver = new NoFlyBehaver();
        woodDuck.setNum("NO002");
        woodDuck.setName("woodduck");
        woodDuck.setColor("black");
        woodDuck.setBehaver(flyBehaver);
        woodDuck.display();
        woodDuck.flyBehaver();

    }
}
