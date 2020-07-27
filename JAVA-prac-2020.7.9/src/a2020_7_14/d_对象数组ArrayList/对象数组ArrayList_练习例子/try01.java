package a2020_7_14.d_对象数组ArrayList.对象数组ArrayList_练习例子;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1~33之间的随机整数，添加到集合，并遍历集合。

思路：
1. 需要存储6个数字，创建一个集合，<Integer>
2. 产生随机数，需要用到Random
3. 用循环6次，来产生6个随机数字：for循环
4. 循环内调用r.nextInt(int n)，参数是33，0~32，整体+1才是1~33
5. 把数字添加到集合中：add
6. 遍历集合：for、size、get
 */
public class try01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        Random rad=new Random();
        for(int i=0;i<6;i++)
        {
            int num;
            num=rad.nextInt(33)+1;
            list1.add(num);
        }
        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }
    }

}
