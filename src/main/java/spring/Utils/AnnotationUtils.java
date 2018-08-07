package spring.Utils;

/**
 * 注解工具类：判断注解是否为空
 */
public class  AnnotationUtils {

    public  static <T>  boolean isEmpty(T t){

        return  t == null ? true : false;

    }


}
