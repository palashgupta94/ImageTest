package com.test.controller;

import com.test.model.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class ImageController {

    @GetMapping("/image")
    public String showImagePage(){
        return "image";
    }

    @PostMapping("/saveImage")
//    public String save(@ModelAttribute TestModel testModel , ModelMap map){
       public String save(@RequestParam("imageFile")MultipartFile file){
//        CommonsMultipartFile file = (CommonsMultipartFile) testModel.getFile();
        System.out.println(file.getName());
        System.out.println(file.getResource());

//        map.addAttribute("TestModel" , testModel);
        return "showFile";

    }
}
