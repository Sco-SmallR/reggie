package heaven.reggie.common;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 13:33 2022/8/5
 * @Modified By:
 */
/**
 * 基于ThreadLocal封装的工具类，用于保存和获取当前登录用户的id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
