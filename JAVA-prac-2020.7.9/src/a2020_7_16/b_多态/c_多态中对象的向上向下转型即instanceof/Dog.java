package a2020_7_16.b_多态.c_多态中对象的向上向下转型即instanceof;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
