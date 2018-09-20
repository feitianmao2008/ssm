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
    }
}
