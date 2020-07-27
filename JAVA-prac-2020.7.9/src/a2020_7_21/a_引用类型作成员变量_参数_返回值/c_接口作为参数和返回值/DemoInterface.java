package a2020_7_21.a_引用类型作成员变量_参数_返回值.c_接口作为参数和返回值;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List正是ArrayList所实现的接口。
 */
public class DemoInterface {

    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);//用result这个变量接收addNames(list)这个函数的返回值
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }

}
