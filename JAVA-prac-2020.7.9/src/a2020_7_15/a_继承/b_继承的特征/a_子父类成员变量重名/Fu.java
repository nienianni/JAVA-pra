package a2020_7_15.a_继承.b_继承的特征.a_子父类成员变量重名;

public class Fu {

    int numFu = 10;

    int num = 100;

    public void methodFu() {
        // 使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }

}
