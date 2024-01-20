package Homeworks.Homework2.Task1;

public class Dog extends Animal{
    boolean haveOwner = false;

    public Dog(String name, int age) {
        super(name, age);
    }

    public boolean isHaveOwner() {
        return haveOwner;
    }

    public void setHaveOwner(boolean haveOwner) {
        this.haveOwner = haveOwner;
    }

//    public void makeSound(){
//        System.out.println("Gaw-gaw");
//    }

    @Override
    public String toString() {
        return "Dog{ " +
                "name=' " + this.getName() + '\'' +
                ", age='" + this.getAge()+ '\'' +
                ", haveOwner='" + haveOwner + '\'' +
                '}';
    }
}
