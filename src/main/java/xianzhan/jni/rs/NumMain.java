package xianzhan.jni.rs;

/**
 * Rust
 *
 * @author xianzhan
 */
public class NumMain {

    private final int internalValue;

    static {
        System.loadLibrary("lib/lib_plus_one");
    }

    public NumMain(int internalValue) {
        this.internalValue = internalValue;
    }

    public native int plusOne(int n);

    public native int power();

    /**
     * 需要设置以下变量
     * -Djava.library.path=lib/path/lib_plus_one
     *
     * @param args args
     */
    public static void main(String[] args) {
        NumMain m = new NumMain(11);

        int n = 3;
        int plus = m.plusOne(n);
        System.out.printf("%d plus one is %d%n", n, plus);

        System.out.printf("%d power is %d%n", m.internalValue, m.power());
    }
}
