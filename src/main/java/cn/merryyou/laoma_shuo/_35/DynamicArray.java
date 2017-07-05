package cn.merryyou.laoma_shuo._35;

import java.util.Arrays;

/**
 * Created by 11 on 2017/5/2.
 */
public class DynamicArray<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] elementData;

    public DynamicArray() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity >= minCapacity) {
            return;
        }

        int newCapacity = oldCapacity * 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    public void add(int index , E element){
        ensureCapacity(size+1);
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index] = element;
        size++;
    }

    public E remove(int index){
        E oldValue = get(index);
        int numMoved = size - index - 1;
        if(numMoved>0){
            System.arraycopy(elementData,index+1,elementData,index,numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

}
