package com.dcb.common.web.util;

import org.apache.commons.codec.binary.Hex;

/**
 * Created by Administrator on 2018/6/7.
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println(Hex.encodeHexString("abc".getBytes()));
        System.out.println(Hex.encodeHex("abc".getBytes()));
        System.out.println("abc".getBytes());
<<<<<<< HEAD
        System.out.println(100 & 1);
=======
>>>>>>> d2750a72bd7d022d23c5cdb6ced0f22ef7c56fcb
    }
}
