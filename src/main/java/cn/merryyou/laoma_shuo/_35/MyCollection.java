package cn.merryyou.laoma_shuo._35;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by 11 on 2017/5/19.
 */
public class MyCollection<E> extends AbstractCollection<E> {
    public MyCollection() {
    }

    DynamicArray<E> darr;

    public MyCollection(DynamicArray<E> darr) {
        this.darr = darr;
    }

    public MyCollection(Collection<? extends E> c){
        this();
        addAll(c);
    }


    @Override
    public Iterator<E> iterator() {
        return new DynamicArrayIterator<>(darr);
    }

    @Override
    public int size() {
        return darr.size();
    }

    @Override
    public boolean add(E e){
        darr.add(e);
        return true;
    }
}
