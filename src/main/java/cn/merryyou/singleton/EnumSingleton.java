package cn.merryyou.singleton;

/**
 * 使用枚举的单例模式
 * Created by 11 on 2017/7/5.
 */
public class EnumSingleton {

    private EnumSingleton(){

    }

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }


    /**
     * 测试单例
     * @param args
     */
    public static void main(String[] args) {
        EnumSingleton obj1 = EnumSingleton.getInstance();
        EnumSingleton obj2 = EnumSingleton.getInstance();
        System.out.println(obj1 == obj2);
    }

}
