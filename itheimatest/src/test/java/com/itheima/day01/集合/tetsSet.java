package com.itheima.day01.集合;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class tetsSet {

    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<>();
        strings.add("黎明");
        strings.add("周星驰");
        strings.add("刘德华");
        strings.add("古天乐");
        strings.add("姚明");

        for (String string : strings) {
            System.out.println(string);
        }

        Map<String,String> map = new HashMap<>();
        map.put("usename1","姚明");
        map.put("usename2","刘德华");
        map.put("usename3","照明");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        System.out.println(entrySet.size());


 Set<Map.Entry<String, String>> entrySet1 = map.entrySet();


    }
}
