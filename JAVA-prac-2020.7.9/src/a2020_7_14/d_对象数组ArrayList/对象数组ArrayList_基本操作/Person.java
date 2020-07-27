package a2020_7_14.d_对象数组ArrayList.对象数组ArrayList_基本操作;

public class Person {

    private String name;
    private int age;

    public Person() {//无参构造
    }

    public Person(String name, int age) {//全参构造
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
