package a2020_7_15.a_继承.b_继承的特征.a_子父类成员变量重名;

public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }

}
