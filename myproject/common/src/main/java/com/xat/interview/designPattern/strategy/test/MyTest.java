package com.xat.interview.designPattern.strategy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        String filePath = "downloan/edw/anc/afafja/202118313881381.zip";
        //System.out.println(filePath.substring(filePath.lastIndexOf("/")+1));
        String fileName = "/app/clmp/20210021012/20210123980.zip  ";
        String file = fileName.substring(0,fileName.lastIndexOf("/"));


        System.out.println(fileName.substring(0,fileName.lastIndexOf(".zip")));
        String[] fileList = {"23","45","678","888","234"};
        List<String> lists = new ArrayList(Arrays.asList(fileList));
        for (String fileName1 : lists){
            if (fileName == "45"){
                //System.out.println(fileName);
                continue;
            }
            //System.out.println(fileName);
        }

        String fileImageName = "249994949494N_530381199710220379_x.jpg";
       // System.out.println(fileImageName.substring(0,fileImageName.indexOf(".")));
    }
}
