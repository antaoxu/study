package com.xat.pojo;

import lombok.Data;

import java.util.List;
@Data
public class MyRequest {
    private List<FileNameDto> fileName;
    private String filePath;
}
