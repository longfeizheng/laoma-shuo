package cn.merryyou.laoma_shuo._35;

/**
 * Created by 11 on 2017/5/2.
 */
public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
