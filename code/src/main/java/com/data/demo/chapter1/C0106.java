package com.data.demo.chapter1;

import java.util.*;

//第一步，求所有可能出现在第一个位置的字符，即把第一个字符和后面所有的字符交换。第二步，固定第一个字符，求后面所有字符的全排列。
// 这个时候仍然把后面所有字符分为两部分：第一个字符以及其后所有字符。这是一个典型的递归问题。
public class C0106 {

   static List<String> list=new ArrayList<>() ;

    public static List<String> perm(char[] buf, int start, int end){

        if(start == end){
            String result = "";
            for(int i=0 ; i<end ; i++){
                result += buf[i];
            }
            System.out.println("-->>"+result.toString());
            list.add(result);
            result = "";
        }else{
            for(int i=start ; i<buf.length ; i++){
                char temp = buf[i];
                buf[i] = buf[start];
                buf[start] = temp;
                System.out.println("-1start->>"+start+"  i="+i);
                perm(buf, start+1, end);

                temp = buf[i];
                buf[i] = buf[start];
                buf[start] = temp;
                System.out.println("-2start->>"+start+"  i="+i);
            }
        }
        return list;
    }

    public static void main(String [] aa){
       String aa1= C0106.perm(new char[]{'a','b','c'},0,3).toString();
        System.out.printf(aa1);
    }

}
