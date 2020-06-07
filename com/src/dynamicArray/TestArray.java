package dynamicArray;

import java.time.Period;

/**
 * @Author: xArthur
 * @Date: 2020-04-15 21:54
 * @File 动态数组接口层测试
 */
public class TestArray {

    public static void main(String[] args) {
        ArrayList<Person> arrayList=new ArrayList<>(3);
        arrayList.add(new Person(1));
        arrayList.add(new Person(1));
        arrayList.add(new Person(1));
        arrayList.add(new Person(1));
        //arrayList.add(2,999);
        System.out.println("数组大小为: "+arrayList.getSize());
        System.out.println(arrayList);
        arrayList.clear();
        System.gc();
        //assert arrayList.get(1)==2:"测试未通过";

    }
}
