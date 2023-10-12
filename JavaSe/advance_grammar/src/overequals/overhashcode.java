package overequals;

public class overhashcode {
    public static void main(String[] args) {
        Object o=new Object();
        int code=o.hashCode();//内存地址经过哈希算法变换得到
        System.out.println(code);
    }
}
