package cn.merryyou.laoma_shuo._26;

/**
 * 自动装箱拆箱
 * 包装类
 * Java中，基本类型和对应的包装类如下表所示：
 * 基本类型            包装类
 * boolean            Boolean
 * byte              Byte
 * short             Short
 * int               Integer
 * long	            Long
 * float	         Float
 * double	        Double
 * char	            Character
 * Created by 11 on 2017/4/27.
 */
public class Test {
    public static void main(String[] args) {

        //Boolean
        boolean b1 = false;
        Boolean bObj = Boolean.valueOf(b1);
        boolean b2 = bObj.booleanValue();

        //Byte
        byte byte1 = 123;
        Byte byteObje = Byte.valueOf(byte1);
        byte byte2 = byteObje.byteValue();

        //Short
        short s1 = 12345;
        Short sObj = Short.valueOf(s1);
        short s2 = sObj.shortValue();

        //Integer
        int i1 = 12345;
        Integer iObj = Integer.valueOf(i1);
        int i2 = iObj.intValue();

        //Long
        long l1 = 12345;
        Long lObj = Long.valueOf(l1);
        long l2 = lObj.longValue();

        //Float
        float f1 = 123.45f;
        Float fObj = Float.valueOf(f1);
        float f2 = fObj.floatValue();

        //Double
        double d1 = 123.45;
        Double dObj = Double.valueOf(d1);
        double d2 = dObj.doubleValue();

        //Character
        char c1 = 'A';
        Character cObj = Character.valueOf(c1);
        char c2 = cObj.charValue();
    }

}
