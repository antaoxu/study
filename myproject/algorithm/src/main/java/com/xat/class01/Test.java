package com.xat.class01;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    /**
     * SHA256withRSA 验证签名
     * @param
     * @param
     * @return 验证结果
     */
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date).toString());


    }


}




