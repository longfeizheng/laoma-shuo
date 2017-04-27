package cn.merryyou.laoma_shuo._24;

import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

/**
 * Created by 11 on 2017/4/27.
 */
public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(Throwable cause) {
        super(cause);
    }
}
