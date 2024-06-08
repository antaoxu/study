package com.xat.utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



import java.io.File;
import java.io.IOException;
/**
 *
 * @author 淡漠
 */
public class PDFRead {

    /**
     * Desc: 验证pdfbox的可行性
     *
     * @author xuantao
     * @date
     */
        public static void main(String[] args) {
            try {
                // 加载 PDF 文档
                PDDocument document = PDDocument.load(new File("D:\\download\\Edge\\1.pdf"));
                // 实例化 PDFTextStripper 类
                PDFTextStripper pdfStripper = new PDFTextStripper();
                // 设置提取范围为第3页
                pdfStripper.setStartPage(1);
                pdfStripper.setEndPage(1);
                // 提取文本内容
                String text = pdfStripper.getText(document);
                // 按行分割文本内容
                String[] lines = text.split("\\r?\\n");
                // 输出第5行的值
                int nameIndex = 7;
                int cerNoIndex = 8;
                if (cerNoIndex < lines.length && nameIndex<lines.length) {
                    String nameValue = lines[nameIndex];
                    System.out.println("第7行的值: " + nameValue);
                    String name = nameValue.substring(nameValue.indexOf("：") + 1).trim();
                    System.out.println("姓名："+name);
                    String certNoValue = lines[cerNoIndex];
                    System.out.println("第8行的值: " + certNoValue);
                    String certNo = certNoValue.substring(certNoValue.indexOf("：") + 1).trim();
                    System.out.println("身份证号："+certNo);
                } else {
                    System.out.println("第8行未找到");
                }
                // 关闭文档
                document.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }


}
