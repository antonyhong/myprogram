package com.ryan.baidu.testandlearn.collectiontest;

import java.util.Arrays;
import java.util.*;
import java.util.Collections;

/**
 * Created by hongyongming on 2015/12/8.
 */
public class CollectionSorte {

    public static void main(String[] args) {


       List<SortEntry> list =  Arrays.asList(new SortEntry("hong", 1), new SortEntry("li", 1), new SortEntry("hong", 3), new SortEntry("hong", 2), new SortEntry("chen", 1));
        System.out.println("origin~");
        list.forEach(e-> System.out.println(e.toString()));
        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("sorted~");
        list.forEach(e-> System.out.println(e.toString()));
    }

    public static class SortEntry{

        public SortEntry(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String name;
        int age;

        @Override
        public String toString() {
            return name +"_"+age;
        }
    }
}

