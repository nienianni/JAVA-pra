package a2020_7_15.a_继承.c_继承中方法的覆盖重写.b_应用场景;

// 定义一个新手机，使用老手机作为父类
public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); // 把父类的show方法拿过来重复利用
        // 自己子类再来添加更多内容
        //如果没有super.show();则，只有新phone姓名、头像，没有原来phone中的号码
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
