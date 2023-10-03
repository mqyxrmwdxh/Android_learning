package Base;

public class java_instanceof {
    public static void main(String[] args) {
        Object o=new Lei();
        System.out.println(o instanceof Lei);//判断前面的对象是否属于后面的类，或属于其子类
        System.out.println(o instanceof Son);
        System.out.println(o instanceof String);
        System.out.println(o instanceof Object);
    }
}
