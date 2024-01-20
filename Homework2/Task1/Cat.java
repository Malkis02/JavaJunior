package Homeworks.Homework2.Task1;

public class Cat extends Animal{
    boolean haveOwner = false;
    boolean haveFlea = true;
    public Cat(String name, int age) {
        super(name, age);
    }

    public boolean isHaveOwner() {
        return haveOwner;
    }

    public void setHaveOwner(boolean haveOwner) {
        this.haveOwner = haveOwner;
    }

    public boolean isHaveFlea() {
        return haveFlea;
    }

    public void setHaveFlea(boolean haveFlea) {
        this.haveFlea = haveFlea;
    }

    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{ " +
                "name='" + this.getName() + '\'' +
                ", age='" + this.getAge()+ '\'' +
                ", haveOwner='" + haveOwner+ '\'' +
                ", haveFlea='" + haveFlea + '\'' +
                '}';
    }
}
