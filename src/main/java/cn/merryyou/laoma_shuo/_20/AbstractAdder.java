package cn.merryyou.laoma_shuo._20;

/**
 * Created by 11 on 2017/4/26.
 */
public abstract class AbstractAdder implements IAdd {
    @Override
    public void addAll(int[] numbers) {
        for (int num : numbers) {
            add(num);
        }
    }
}
