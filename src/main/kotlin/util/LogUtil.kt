package util

/**
 * Created by yocn on 2018/11/29.
 */
class LogUtil {
    companion object {
        fun d(msg: String) {
            System.out.print(msg + "\n")
        }

        fun dd(msg: String) {
            System.out.print(msg )
        }

        fun d(msg: Int) {
            System.out.print("" + msg + "\n")
        }
    }
}