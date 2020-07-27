package a2020_7_15.a_继承.b_继承的特征.b_子父类成员局部变量重名;

public class Zi extends Fu {

    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num); // 30，局部变量
        System.out.println(this.num); // 20，本类的成员变量
        System.out.println(super.num); // 10，父类的成员变量
    }

}
