package top.tfirst.stratregy;
/**
 * 采用实现的手段去增加新的方法和采用增加父类方法以及重写父类方法修改的效果都是一样的
 *
 * */

public class RedHeadDuck extends Duck implements FlyBehaver{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("the " + this.num + "duck :" + this.name + "'s head is " + this.color );
    }

    public void behaver() {
        System.out.println("呱呱叫");
    }

    public void excessFun(){
        System.out.println("the express function !");
    }

    public void fly() {
        System.out.println("flying with wing");
    }

}
