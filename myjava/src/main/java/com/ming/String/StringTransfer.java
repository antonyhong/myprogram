package com.ming.String;

import sun.swing.plaf.synth.DefaultSynthStyle;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Created by hongyongming on 2016/2/18.
 */
public class StringTransfer {
    public static void main(String[] args) {
        test();
    }

    private static void testByteArrayInputStream(){
        String content  = "I'm a String";
        byte[] StrByte =  content.getBytes(Charset.forName("utf-8"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(StrByte);


    }

    private static void test(){
        String v  = (String) getIntObj();
        System.out.println(v);
    }

    private static Object getIntObj(){
        return Integer.valueOf(15);
    }
}
