package com.ryan.baidu.testandlearn;


import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

/**
 * Created by hongyongming on 2015/12/28.
 */
public class Test {

//    public static void main(String[] args) {
//        Optional<Integer> opt= Optional.empty();
//
//       // Map<String,String> map = new HashMap<>();
//        //map.computeIfAbsent()
//        List<String> list = new ArrayList<>();
//        //list.sort();
//        //Collections.sort();
//
//        /**C#中可以用 list.orderBy(str=> random.next());来达到相同的目的*/
//        Collections.shuffle(list);
//
//        int num = 1;
//        Converter<Integer, String> stringConverter =
//                (from) -> Integer.valueOf(from + num);
//        /**num 使用lambda  引用的变量应该是(不用final标识也可) 是final的*/
//       //num = 3;
//
//
//    }

    public static void main(String[] args) {

        //Map<String,String> map = new HashMap<>();
        //map.put(null,"hello");
        //System.out.println(map.get(null));
        //testStringForamt();
        //IntStream.range(0,100).forEach(i-> System.out.println(RandomStringUtils.randomNumeric(10)));

        //ConcurrentHashMap
      //  test();

       // System.out.println(System.getProperty("sun.boot.class.path"));
        testFloat();
    }

    private static  void testFloat(){
        System.out.println((3*0.1));
        System.out.println((3*0.1) == 0.3);

    }

    public static void test(){
        String str = null;
        System.out.println(str == null||str.equals("hel"));
    }

    /***
     * double 存在精度的问题。
     * */
    public static  void testDouble(){
        //        String str1 = "hello";
//        String str2 = new String("hello") ;
//
//        Integer integer1= Integer.valueOf("100");
//        Integer integer2 = Integer.valueOf("100");
//        System.out.println(integer1 == integer2);


        double d = 301353.0499999999883584678173065185546875d;
        System.out.println(String.valueOf(d));
        System.out.println(new java.math.BigDecimal(d));
        System.out.println(new java.math.BigDecimal(301353.05*1000/1000));


        double a = (3.3-2.4)/0.1;
        System.out.println(a);
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(8.9999999999999999999999999999999D));

        double d1 = 2.4;
        System.out.println(d1);
    }


    public static  void  testStringForamt(){
        Float f = 0.225f;
        Float f1 = 0.235f;
        Float f2 = 0.265f;

        System.out.println(String.format("%.2f",f));
        System.out.println(String.format("%.2f",f1));
        System.out.println(String.format("%.2f",f2));

        String fStr =  "0.125";
        int index = fStr.lastIndexOf(".");
    }
}
