package top.tfirst.stratregy;

public class TimberDuck extends Duck {

    public void display() {
        System.out.println("the number" +
                ": " + this.num + " Duck's head is " +
                this.color  +
                "  and the duck's name is " +  this.name);
    }

    public void behaver() {
        System.out.println(" this type of duck have no behaver! ");
    }
}
