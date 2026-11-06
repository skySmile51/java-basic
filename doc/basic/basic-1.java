//Java 语言有哪些特点？
//1. 面向对象（封装，继承，多态）；
//2. 平台无关性（Java 虚拟机实现平台无关性）；
//3. 支持多线程（C++ 语言没有内置的多线程机制，因此必须调用操作系统的多线程功能来进行多线程程序设计，而 Java 语言却提供了多线程支持）；
//4. 可靠性（具备异常处理和自动内存管理机制）；
//5. 安全性（Java 语言本身的设计就提供了多重安全防护机制如访问权限修饰符、限制程序直接访问操作系统资源）；
//6. 高效性（通过 Just In Time 编译器等技术的优化，Java 语言的运行效率还是非常不错的）；
//7. 编译与解释并存；

//Java 8 大基础数据类型
// 布尔（boolean）、字节（byte）、整型（int）、短整型（short）、长整型（long）、单精度型（float）、双精度型（double）、字符型（char）

public class Basic {
  public static void main(String[] args) {
    // 源码中的Sting类型的class修饰符是`final class`，**不可变** 不可继承**
    String s1 = "TanMu"; // 在常量池创建一个对象，将对象的引用地址返回
    String s2 = "TanMu"; // 此时常量池中已经存在 "TanMu" 对象，因此 s2 引用的是常量池中 "TanMu" 对象的引用地址
    System.out.println(s1 == s2); // true

    String s3 = "ZhangSan"; // 在常量池创建一个对象，将对象的引用地址返回
    String s4 = new String("ZhangSan"); // "ZhangSan" 在常量池创建一个对象，在堆内存创建一个对象，将对象的引用地址返回
    String s5 = s3.intern(); // 将 s3 的引用地址指向常量池中的 "ZhangSan" 对象
    System.out.println(s3 == s4); // false
    System.out.println(s3 == s5); // true

    // 1. length()：获取字符长度
    System.out.println(s3.length());

    // 2. charAt(int index)：获取指定索引处的字符
    System.out.println(s3.charAt(0)); // 'Z'

    // 3. substring(int start, int end)：获取指定索引处的字符
    System.out.println(s3.substring(0, 3)); // "Zha"

    // 4. indexOf(String str)：获取指定字符串的索引
    System.out.println(s3.indexOf("San")); // 2

    // 5. startsWith(String str)：判断是否以指定字符串开头
    System.out.println(s3.startsWith("Zhang")); // true

    // 6. endsWith(String str)：判断是否以指定字符串结尾
    System.out.println(s3.endsWith("San")); // true

    // 7. contains(String str)：判断是否包含指定字符串
    System.out.println(s3.contains("Zhang")); // true

    // 8. equals(Object obj)：判断是否等于指定对象
    System.out.println(s3.equals("ZhangSan")); // true

    // 9. equalsIgnoreCase(String str)：判断是否等于指定字符串，忽略大小写
    System.out.println(s3.equalsIgnoreCase("zhangsan")); // true

    // 10. compareTo(String str)：比较两个字符串
    System.out.println(s3.compareTo("ZhangSan")); // 0

    // 11. compareToIgnoreCase(String str)：比较两个字符串，忽略大小写
    System.out.println(s3.compareToIgnoreCase("zhangsan")); // 0

    // 12. concat(String str)：连接两个字符串
    System.out.println(s3.concat("LiSi")); // "ZhangSanLiSi"

    // 13. replace(char oldChar, char newChar)：替换指定字符
    System.out.println(s3.replace('Z', 'L')); // "LhangSan"

    // 14. replaceFirst(String regex, String replacement)：替换第一个指定字符串
    System.out.println(s3.replaceFirst("Zhang", "Li")); // "LiSan"

    // 15. replaceAll(String regex, String replacement)：替换所有指定字符串
    System.out.println(s3.replaceAll("Zhang", "Li")); // "LiSan"

    // 17. join(CharSequence delimiter, CharSequence... elements)：连接字符串
    System.out.println(String.join("-", "Zhang", "San")); // "Zhang-San"

    // 18. toLowerCase()：转换为小写字母
    System.out.println(s3.toLowerCase()); // "zhangsan"

    // 19. toUpperCase()：转换为大写字母
    System.out.println(s3.toUpperCase()); // "ZHANGSAN"

    // 20. trim()：去除字符串两端的空格
    System.out.println(s3.trim()); // "ZhangSan"

    // == 和 equals() 的区别
    // == 比较的是对象的引用地址，equals() 比较的是对象的内容
    System.out.println(s3 == s4); // false
    System.out.println(s3.equals(s4)); // true

    // StringBuilder：可变字符串，线程不安全，效率高
    StringBuilder sb = new StringBuilder("ZhangSan");
    sb.append("LiSi");
    System.out.println(sb); // 在原有的对象基础上追加内容，并返回该对象的引用

    String Str = s3 + "LiSi";
    System.out.println(Str); // 创建了一个新的常量池对象引用指向"ZhangSanLiSi"，并返回该引用

    // StringBuilder 和 StringBuffer 的区别
    // StringBuilder 线程不安全，效率高，StringBuffer 线程安全，效率低
    // StringBuilder 和 StringBuffer 的实现原理相同，都是通过字符数组来实现的
    // StringBuilder 和 StringBuffer 的性能差异主要在于线程安全性的开销

    // char与Character的区别
    // char是基本数据类型，Character是引用数据类型
    // char是基本数据类型，只能存储一个字符，Character是引用数据类型，只能存储一个字符

    Character ch = 'a'; // 自动装箱，将char类型转换为Character类型
    System.out.println(ch.charValue()); // 'a'

    char c = ch; // 自动拆箱，将Character类型转换为char类型
    System.out.println(c); // 'a' 
    // System.out.println(c.intValue()); // 97

    int code = ch.charValue(); // 自动拆箱，再转int拿到Unicode编码
    System.out.println(code); // 97
  }
}
