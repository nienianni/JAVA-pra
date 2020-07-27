package a2020_7_14.d_对象数组ArrayList.对象数组ArrayList_练习例子;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。

System.out.println(list);       [10, 20, 30]
printArrayList(list);           {10@20@30}
 */
public class try03 {
    public static void main(String[] args) {
        ArrayList<String> list2=new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        System.out.println(list2);

        printArrayList(list2);
    }
    public static void printArrayList(ArrayList<String> list)
    {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }
}
