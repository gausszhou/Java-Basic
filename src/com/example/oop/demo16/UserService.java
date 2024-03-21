package com.example.oop.demo16;

/**
 * 接口的作用
 * 1. 主要是起一个约束的作用
 * 2. 定义方法，让不同的类来实现
 * 3. public abstract
 * 4. public static final
 * 5. 接口不能直接实例化
 * 6. implements 可以实现多个接口
 * 7. 必须重写接口中的方法
 */

public interface UserService {
    // 接口中的所有定义都是抽象的
    void add(String name);

    void delete(int id);

    void update();

    void query(String name);
}
