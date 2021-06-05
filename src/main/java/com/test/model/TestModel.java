package com.test.model;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class TestModel {

    private CommonsMultipartFile file;
    private String text;

    public TestModel() {
    }

    public TestModel(CommonsMultipartFile file, String text) {
        this.file = file;
        this.text = text;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
