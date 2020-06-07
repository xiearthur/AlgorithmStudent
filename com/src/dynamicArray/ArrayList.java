package dynamicArray;

import dynamicLinkedList.AbstractList;

import java.util.Arrays;

/**
 * @Author: xArthur
 * @Date: 2020-04-15 21:51
 * @File 动态数组接口层
 */
public class ArrayList<E> extends AbstractList {
    private int size=0;
    private E[] element;
    private int DEFAULT_SIZE=100;

    /**
     * 增加，传入位置-值
     */
    public void add(int location,E content){
        if (location<0 || location>=element.length){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        element[location]=content;
    }

    /**
     * 清除所有数据
     */
    public void clear(){
        for (int i = 0; i <size; i++) {
            element[i]=null;
        }
            size=0;
        // 如果直接element=null 则需要重新申请空间

    }

    /**
     * 增加，传入位置-值
     */
    public void add(E content){
        // 如果大小已经达到极值，需要扩容
        if (size==element.length){
            dynamicAdd();
            //throw new ArrayIndexOutOfBoundsException("空间已满需要扩容");
        }
        element[size]=content;
        size++;
    }

    /**
     * 增加，传入位置-值
     */
    public void dynamicAdd(){
        // 如果大小已经达到极值，需要扩容
        E[] elementNew= (E[]) new Object[size+10];
        if (size==element.length){
            System.out.println("正在进行扩容");
            for (int i=0;i<size;i++) {
                elementNew[i]=element[i];
            }
            element=elementNew;
        }else {
            System.out.println("不需要扩容");
        }

    }

    /**
     * 获取指定位置参数
     * @param location
     * @return
     */
    public E get(int location){
        if (location<0 || location>=element.length){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        return element[location];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    /**
     * 默认传入大小
     * @param size
     */
    public ArrayList(int size) {
        // 将object 强转
         element= (E[]) new Object[size];
    }

    /**
     * 获取动态数组大小
     * @return
     */
    public int getSize(){
        return element.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer=new StringBuilder("[");
        for (int i=0;i<size;i++){
            if (i==size-1){
                stringBuffer.append(element[i]);

            }else {
                stringBuffer.append(element[i]).append(",");

            }
        }
        //stringBuffer.deleteCharAt(stringBuffer.length());
        return stringBuffer.append("]").toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("动态数组 内存清理");
    }
}
