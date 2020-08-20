package com.study.study01.single;
/**
 * 单例模式（Singleton Pattern）是指确保一个类在任何情况下都绝对只有一个实例，并 提供一个全局访问点。
 * 单例模式是创建型模式。单例模式在现实生活中应用也非常广泛。
 * 在 J2EE 标准中，ServletContext、 ServletContextConfig 等；
 * 在 Spring 框架应用中 ApplicationContext；数据库的连接 池也都是单例形式.
 */


/**
 * 饿汉式单例是在类加载的时候就立即初始化，并且创建单例对象。
 * 绝对线程安全，在线 程还没出现以前就是实例化了，不可能存在访问安全问题。
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存.
 * 饿汉式适用在单例对象较少的情况。下面我 们来看性能更优的写法.
 */

/**
 * @Auther: kid
 * @Date: 2020/8/20 22:08
 * @Description:
 */
public class HungrySingleton {
    //先静态、后动态 //先属性、后方法 //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
    /**饿汉的静态写法
     *
     */
//    static {
//        hungrySingleton = new HungryStaticSingleton();
//    }
//
//    private HungryStaticSingleton() {
//    }
//
//    public static HungryStaticSingleton getInstance() {
//        return hungrySingleton;
//    }
}
