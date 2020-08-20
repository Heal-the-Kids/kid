package com.study.study01.single;
/**
 * 懒汉式单例的特点是：被外部类调用的时候内部类才会加载.
 */

/**
 * @Auther: kid
 * @Date: 2020/8/20 22:16
 * @Description:
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;

    //下面的单例存在线程安全隐患
//    public static LazySimpleSingleton getInstance() {
//        if (lazy == null) {
//            lazy = new LazySimpleSingleton();
//        }
//        return lazy;
//    }

    /**
     * synchronized 监视锁的运行状态，线程安全的问题便解决了。
     * 但是，用 synchronized 加锁，在线程数量比较多情况下，
     * 如果 CPU 分配压力上升，会导致大批 量线程出现阻塞，
     * 从而导致程序运行性能大幅下降。那么，有没有一种更好的方式，既 兼顾线程安全又提升程序性能呢？
     */
//    public static LazySimpleSingleton getInstance() {
//        if (lazy == null) {
//            synchronized (LazySimpleSingleton.class) {
//                if (lazy == null) {
//                    lazy = new LazySimpleSingleton();
//                    return lazy;
//                }
//            }
//        }
//        return lazy;
//    }

    /**
     * synchronized 关键字，总归是要上锁，对程序性能还是存在一定影响的。
     * 难道就真的没有更好的方案吗？
     * 当然是有的。我们可以从类初始化角度来考虑，看下面的 代码，采用静态内部类的方式：
     * 这种形式兼顾饿汉式的内存浪费，也兼顾 synchronized 性能问题
     */

    //每一个关键字都不是多余的
    // static 是为了使单例的空间共享
    // 保证这个方法不会被重写，重载
    public static final LazySimpleSingleton getInstance() {
        //在返回结果以前，一定会先加载内部类
        // 默认不加载
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazySimpleSingleton LAZY = new LazySimpleSingleton();
    }
}

class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
