package a2020_7_16.b_多态.b_多态中的成员变量及成员方法的访问规则;

public class Fu /*extends Object*/ {

    int num = 10;

    public void showNum() {
        System.out.println(num);
    }

    public void method() {
        System.out.println("父类方法");
    }

    public void methodFu() {
        System.out.println("父类特有方法");
    }

}
