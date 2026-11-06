
public class Basic {
  public static void main(String[] args) {
    // 1. parseBoolean：字符串转 boolean
    // 只有字符串等于 "true"（忽略大小写）返回true，其余全部false
    boolean b1 = Boolean.parseBoolean("true"); // true
    boolean b2 = Boolean.parseBoolean("false"); // false
    boolean b3 = Boolean.parseBoolean("wfsd"); // false
    boolean b4 = Boolean.parseBoolean("etrtgr"); // false

    // 手动装箱
    boolean b5 = true;
    Boolean bo1 = Boolean.valueOf(b5);
    // 手动拆箱
    boolean b6 = bo1.booleanValue();

    // 自动装箱（JDK1.5+语法糖）
    Boolean bo2 = true;
    // 自动拆箱
    boolean b7 = bo2;

    boolean b8 =  8 > 6; // true
    System.out.println(b8);
  }
}
