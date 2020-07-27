package a2020_7_16.b_多态.b_多态中的成员变量及成员方法的访问规则;

public class Zi extends Fu {

    int num = 20;

    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        System.out.println("子类特有方法");
    }
}
