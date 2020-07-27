package a2020_7_15.a_继承.b_继承的特征.c_子父类成员方法重名;

public class Zi extends Fu {

    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    public void method() {
        System.out.println("子类重名方法执行！");
    }

}
