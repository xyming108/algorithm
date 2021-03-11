/**
 * @user: Hasee
 * @date: 2021/3/3 11:24
 * @author: 1931559710@qq.com
 * ClassName: Singleton
 * Description:
 */
public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
