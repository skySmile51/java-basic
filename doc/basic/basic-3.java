
public class Basic {
  public static void main(String[] args) {
    // ✅ 赋值，字面量数字在short范围内可以直接赋值
    short s1 = 100;
    System.out.println(s1);

    // ❌ 超出范围，编译报错
    // short s2 = 40000;

    // ========= 坑：short参与运算自动提升为int =========
    short a = 10;
    short b = 20;
    // short c = a + b; // 编译报错！a+b结果是int，不能直接赋值给short
    int res = a + b;
    System.out.println(res);

    // 想要存回short，需要强制类型转换（注意溢出风险）
    short c = (short)(a + b);
    System.out.println(c);

    // 装箱拆箱
    Short shObj = s1; // 自动装箱 Short.valueOf(s1)
    short s3 = shObj; // 自动拆箱 shObj.shortValue()

    // int 类型数字 Integer包装类
    int age = 22;
    int count = 999;
    int num = -100;
    System.out.println("age=" + age + ",count=" + count);

    // 最大值、最小值常量（Integer包装类提供）
    System.out.println("int最大值：" + Integer.MAX_VALUE);
    System.out.println("int最小值：" + Integer.MIN_VALUE);

    // 溢出演示（重点！溢出不会报错，会循环，业务要避免）
    int max = Integer.MAX_VALUE;
    int overflow = max + 1;
    System.out.println("最大值+1溢出结果：" + overflow); // 变成负数

    // 装箱拆箱
    Integer iObj = 66;  // 自动装箱 Integer.valueOf(66)
    int i2 = iObj;      // 自动拆箱 iObj.intValue()


    // long 类型数字 Long包装类
    // ✅ 正确，末尾加L
    long l1 = 10000000000L;
    // ❌ long l2 = 10000000000;  不加L，字面量是int，超出int范围直接报错

    // 获取系统时间戳，返回就是long
    long time = System.currentTimeMillis();
    System.out.println("时间戳：" + time);

    System.out.println("long最大值：" + Long.MAX_VALUE);
    System.out.println("long最小值：" + Long.MIN_VALUE);

    // 运算：int和long一起运算，int自动提升为long
    int e = 100;
    long d = 200L;
    long result2 = e + d;
    System.out.println(result2);

    // 装箱拆箱
    Long lObj = 999L;
    long l3 = lObj;
    System.out.println(l3);

    // 拆箱
    Long l4 = 44L;
    long l5 = l4;
    System.out.println(l5);


    // 总结包装类 hort、Integer、Long 的 `valueOf()` 都缓存 **-128 ~ 127**，当包装类赋值超过这个范围时则换创建新的对象，不在使用缓存

    Integer n11 = 100;
    Integer n22 = 100;
    System.out.println(n11 == n22); // true 在缓存区间

    Integer n33 = 200;
    Integer n44 = 200;
    System.out.println(n33 == n44); // 因为超出了缓存范围，所以两者是新的对象，结果为false

    // 所有的包装类比值应该使用equals方法
    System.out.println(n33.equals(n44)); // true
  }
}