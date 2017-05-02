package cn.merryyou.laoma_shuo._35;

/**
 * Created by 11 on 2017/5/2.
 */
public class GenericMethod {

    public static void main(String[] args) {
        indexOf(new Integer[]{1,3,5}, 10);
    }

    public static <T> int indexOf(T[] arr, T elm){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(elm)){
                return i;
            }
        }
        return -1;
    }
}
