package overequals;
//java的垃圾回收器不轻易启动
//垃圾太少或时间没到种种条件下可能启动也可能不启动
class A{
    public static void main(String[] args) {
        for(int i=1000;i>0;i--) {//多造点垃圾，否则没回收
            overfinalize a = new overfinalize();
            a = null;
            System.gc();//建议垃圾回收器启动，可能不启动
        }
    }
}
public class overfinalize {
    @Override//类似于析构函数，在垃圾回收器回收对象销毁时调用，让程序员手动做一些事
    protected void finalize() throws Throwable {//自从jdk9就过时了
        System.out.println("即将被销毁");
    }
}
