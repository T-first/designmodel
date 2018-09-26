package top.tfirst.stratregy;

public abstract class Duck {
    protected  String name;
    protected FlyBehaver behaver;
    protected  String color;
    String num;

    public Duck() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public abstract void display();

    public FlyBehaver getBehaver() {
        return behaver;
    }

    public void setBehaver(FlyBehaver behaver) {
        this.behaver = behaver;
    }
    public void flyBehaver(){
        behaver.fly();
    };
    public void swamBehaver(SwamBehaver swamBehaver){
        swamBehaver.swim();
    }
    public abstract void behaver();



}
