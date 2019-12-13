package com.util;

import org.junit.Test;

/**
 * CheckUtils
 *
 * @author Zhangzhenqi
 * @create 2019-12-12 22:30
 */
public class CheckUtils {
    /* 判断字符串中是否包含空格 */
    public static boolean isAnyEmpty(String strings) {
        boolean flag = false;
        int index = strings.indexOf(" ");
        if (index == -1) {
            flag = true;
        }
        return flag;
    }
    /* 判断数组是否为空 */
    public static boolean isEmpty(Object[] arr) {
        if(arr != null && arr.length != 0){
            return false;
        }
        return true;
    }
    /* 判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回false */
    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }
    /* 判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false */
    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        return n1==n2;
    }
    @Test
    public void test1() {
        String str = "dfsajhfhdsjhfj";
        boolean flag = isAnyEmpty(str);
        System.out.println(flag);
    }

    @Test
    public void test2() {
        String str1 = "null";
        String str2 = "a";
        int n1 = 5;
        int n2 = 5;
        System.out.println(equals(str1,str2));
        System.out.println(equals(n1,n2));
    }
}
