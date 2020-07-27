package a2020_7_15.a_继承.b_继承的特征.a_子父类成员变量重名;

/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接:通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接:通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
 */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu(); // 创建父类对象
        System.out.println(fu.numFu); // 只能使用父类的东西，没有任何子类内容
        System.out.println("===========");

        Zi zi = new Zi();

        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("===========");

        // 等号左边（Zi zi = new Zi()）是谁，就优先用谁（意思是看类）
        System.out.println(zi.num); // 优先子类，200(直接访问）
//        System.out.println(zi.abc); // 到处都没有，编译报错！
        System.out.println("===========");

        // 这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi(); // 200
        // 这个方法是在父类当中定义的，
        zi.methodFu(); // 100
    }

}
