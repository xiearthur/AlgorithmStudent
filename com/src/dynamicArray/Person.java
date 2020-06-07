package dynamicArray;

/**
 * @Author: xArthur
 * @Date: 2020-05-02 19:11
 * @File 财富日历二期接口
 */
public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Person dead");
    }
}
